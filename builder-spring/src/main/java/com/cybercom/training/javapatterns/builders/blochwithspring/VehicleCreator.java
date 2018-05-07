package com.cybercom.training.javapatterns.builders.blochwithspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleCreator {
    public static void main(String... args) {
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
            System.out.println(vehicle.describe());
        }
    }
}
