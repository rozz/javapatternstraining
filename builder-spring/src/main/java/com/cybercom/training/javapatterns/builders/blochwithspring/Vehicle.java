package com.cybercom.training.javapatterns.builders.blochwithspring;

public class Vehicle {
    private Tires tires;
    private Engine engine;
    private Body body;

    private Vehicle(Tires tires, Engine engine, Body body) {
        this.body = body;
        this.engine = engine;
        this.tires = tires;
    }

    public Tires getTires() {
        return tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public Body getBody() {
        return body;
    }

    public String describe() {
        return String.format("ENGINE: %1$s, BODY: %2$s, TIRES: %3$s", engine.model(), body.type(), tires.type());
    }

    public static class Builder {
        private Tires tires;
        private Engine engine;
        private Body body;

        public Builder setTires(Tires tires) {
            this.tires = tires;
            return this;
        }
        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }
        public Builder setBody(Body body) {
            this.body = body;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(tires, engine, body);
        }
    }
}
