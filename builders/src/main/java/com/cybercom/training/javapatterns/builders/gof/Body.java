package com.cybercom.training.javapatterns.builders.gof;

public class Body {
    private String type;

    public Body(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }
}
