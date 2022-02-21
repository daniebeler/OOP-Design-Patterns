package com.daniebeler.motorsteuerung;

public class Main {

    public static void main(String[] args) {

        AbstractMotorController economy = new Economy();
        AbstractMotorController topspeed = new TopSpeed();
        AbstractMotorController superspar = new SuperSpar();
        LightController light = new LightController();

        Car car = new Car();

        car.addObserver(economy);
        car.addObserver(topspeed);
        car.addObserver(superspar);

        car.addObserver(light);

        car.drive(12);
        car.drive(30);
        car.drive(80);
        car.drive(175);

    }
}
