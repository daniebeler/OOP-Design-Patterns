package com.daniebeler.acceleration;

public class Motorcycle implements Acceleration{

    private final Acceleration acceleration;
    private final String plate;

    public Motorcycle(Acceleration acc, String plate) {
        this.acceleration = acc;
        this.plate = plate;
    }

    @Override
    public String accelerate() {
        return "Motorrad " + plate + ": " + acceleration.accelerate();
    }
}
