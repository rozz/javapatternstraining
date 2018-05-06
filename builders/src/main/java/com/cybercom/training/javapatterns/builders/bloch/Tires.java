package com.cybercom.training.javapatterns.builders.bloch;

public class Tires {
    private final String type;

    public Tires(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }
}
