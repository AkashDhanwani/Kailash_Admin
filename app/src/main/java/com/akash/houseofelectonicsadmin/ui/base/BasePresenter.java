package com.akash.houseofelectonicsadmin.ui.base;

import android.util.Log;

import com.akash.houseofelectonicsadmin.utils.CommonUtils;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    @Override
    public void onAttach(V mvpView) { Log.d(CommonUtils.TAG_flow, "Inside onAttach Basepresenter"); mMvpView = mvpView; }

}
