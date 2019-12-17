package com.example.androidmaster.DAGRepo;

import com.example.androidmaster.MainActivity;

import javax.inject.Inject;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();
    void CarInject(MainActivity activity);
}

