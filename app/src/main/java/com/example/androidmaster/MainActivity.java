package com.example.androidmaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.example.androidmaster.DAGRepo.Car;
import com.example.androidmaster.DAGRepo.CarComponent;
import com.example.androidmaster.DAGRepo.DaggerCarComponent;
import com.paytm.pgsdk.PaytmPGService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_SMS, Manifest.permission.RECEIVE_SMS}, 101);
        }

        CarComponent getCarComponent = DaggerCarComponent.create();
        getCarComponent.CarInject(this);
        //car = getCarComponent.getCar();
        car.getCar();
        //PaytmPGService Service = PaytmPGService.getStagingService("https://securegw-stage.paytm.in/order/process");


    }
}
