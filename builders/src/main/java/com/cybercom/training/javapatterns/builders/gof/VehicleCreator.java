package com.cybercom.training.javapatterns.builders.gof;

public class VehicleCreator {
    private VehicleBuilder builder;

    public VehicleCreator (VehicleBuilder builder) {
        this.builder = builder;
    }

    public Vehicle create() {
        builder.mountEngine();
        builder.applyBody();
        builder.mountTires();

        return builder.build();
    }

    public static void main(String... args) {
        Vehicle car = new VehicleCreator(new CarBuilder()).create();
        Vehicle truck = new VehicleCreator(new TruckBuilder()).create();

        System.out.println(car.describe());
        System.out.println(truck.describe());
    }
}

interface VehicleBuilder {
    void mountEngine();
    void applyBody();
    void mountTires();
    Vehicle build();
}

class TruckBuilder implements VehicleBuilder {
    private Vehicle vehicle = new Vehicle();

    @Override
    public void mountEngine() {
        vehicle.setEngine(new Engine("DTI 13 : 440 / 480 / 520 KM"));
    }

    @Override
    public void applyBody() {
        vehicle.setBody(new Body("HIGH SLEEPER CAB"));
    }

    @Override
    public void mountTires() {
        vehicle.setTires(new Tires("Goodride AD156"));
    }

    @Override
    public Vehicle build() {
        return vehicle;
    }
}

class CarBuilder implements VehicleBuilder {
    private Vehicle vehicle = new Vehicle();

    @Override
    public void mountEngine() {
        vehicle.setEngine(new Engine("1.6 16V 105 KM"));
    }

    @Override
    public void applyBody() {
        vehicle.setBody(new Body("Sedan"));
    }

    @Override
    public void mountTires() {
        vehicle.setTires(new Tires("Dębica Passio 2 175/65 R14 82 T"));
    }

    @Override
    public Vehicle build() {
        return vehicle;
    }
}