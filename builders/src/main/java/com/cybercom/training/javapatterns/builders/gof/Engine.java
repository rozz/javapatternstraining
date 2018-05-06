package com.cybercom.training.javapatterns.builders.gof;

public class Engine {
    private String model;

    public Engine(String model) {
        this.model = model;
    }
    public String model() {
        return model;
    }
}
