package com.example.appsale18102021;

import dagger.Component;

@Component(modules= CarModule.class)
public interface MainComponent {
    Car getCar();

}
