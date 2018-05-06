package com.cybercom.training.javapatterns.builders.bloch;

public class VehicleCreator {
    public static void main(String... args) {
        Vehicle car = new Vehicle.Builder()
                .withBody(new Body("Sedan"))
                .withEngine(new Engine("1.6 16V 105 KM"))
                .withTires(new Tires("Dębica Passio 2 175/65 R14 82 T"))
                .build();
        System.out.println(car.describe());
    }
}
