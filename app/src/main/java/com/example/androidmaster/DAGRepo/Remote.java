package com.example.androidmaster.DAGRepo;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote(){

    }

    public void connectRemote(){
        Log.d(TAG, "connectRemote: ");
    }
}


