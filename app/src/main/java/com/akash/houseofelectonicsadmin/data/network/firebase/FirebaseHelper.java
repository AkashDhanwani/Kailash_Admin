package com.akash.houseofelectonicsadmin.data.network.firebase;

import android.net.Uri;

import com.akash.houseofelectonicsadmin.data.network.firebase.model.ProductData;

public interface FirebaseHelper {

    void uploadProductData(String folderName, String fileName, Uri uri,  int size,
                            ProductData productData,  String subFolder,  String mainFolder);

    void getProductData();
}
