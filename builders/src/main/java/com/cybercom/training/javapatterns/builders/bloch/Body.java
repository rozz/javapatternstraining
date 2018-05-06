package com.cybercom.training.javapatterns.builders.bloch;

public class Body {
    private String type;

    public Body(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }
}
