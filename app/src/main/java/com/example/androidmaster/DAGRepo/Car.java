package com.example.androidmaster.DAGRepo;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;

    private  Wheels wheels;

    @Inject
    public Car(Engine engine , Wheels wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    public void getCar(){
        Log.d(TAG, "getCar: running");
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.connectRemote();
        Log.d(TAG, "enableRemote: TRUE");
    }
}
