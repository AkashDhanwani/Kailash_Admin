package com.akash.houseofelectonicsadmin.ui.base;

import android.support.v7.app.AppCompatActivity;

import com.akash.houseofelectonicsadmin.utils.CommonUtils;

public class BaseActivity extends AppCompatActivity implements MvpView {

    @Override
    public boolean isNetworkConnected() {
        return CommonUtils.isNetworkConnected(this);
    }
}
