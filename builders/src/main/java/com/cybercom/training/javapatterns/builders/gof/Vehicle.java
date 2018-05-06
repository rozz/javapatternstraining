package com.cybercom.training.javapatterns.builders.gof;

public class Vehicle {
    private Engine engine;
    private Body body;
    private Tires tires;


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String describe() {
        return String.format("ENGINE: %1$s, BODY: %2$s, TIRES: %3$s", engine.model(), body.type(), tires.type());
    }
}
