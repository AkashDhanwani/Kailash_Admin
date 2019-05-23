package com.akash.houseofelectonicsadmin.data.network.firebase;

import android.net.Uri;
import android.support.annotation.NonNull;

import com.akash.houseofelectonicsadmin.data.network.firebase.model.ProductData;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.ArrayList;

public class AppFirebaseHelper implements FirebaseHelper {

    DatabaseReference mDatabaseReference;
    StorageReference mStorageReference;

    ArrayList<String> downloadLink = new ArrayList<>();

    public AppFirebaseHelper(){
        mDatabaseReference = FirebaseDatabase.getInstance().getReference();
        mStorageReference = FirebaseStorage.getInstance().getReference();
    }

    @Override
    public void uploadProductData(String foldername, String fileName, Uri uri, final int size,
                                  final ProductData productData, final String subFolder, final String mainFolder) {

        final StorageReference reference = mStorageReference.child(foldername+"/"+fileName);
        UploadTask uploadTask = reference.putFile(uri);

        Task<Uri> uriTask = uploadTask.continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
            @Override
            public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception {
                if(!task.isSuccessful())
                    throw task.getException();

                return reference.getDownloadUrl();
            }
        }).addOnCompleteListener(new OnCompleteListener<Uri>() {
            @Override
            public void onComplete(@NonNull Task<Uri> task) {
                if (task.isSuccessful()){
                    downloadLink.add(task.getResult().toString());
                    //Start hereaaaaaaaaaaa

                }
                else {
                    //Handle the error here
                }
            }
        });


    }

    @Override
    public void getProductData() {

    }
}
