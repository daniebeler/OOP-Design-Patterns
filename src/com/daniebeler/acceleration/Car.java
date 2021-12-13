package com.daniebeler.acceleration;

public class Car implements Acceleration{

    private final Acceleration acceleration;
    private final String plate;

    public Car(Acceleration acc, String plate) {
        this.acceleration = acc;
        this.plate = plate;
    }

    @Override
    public String accelerate() {
        return "Auto " + plate + ": " + acceleration.accelerate();
    }
}
