package com.daniebeler.motorsteuerung;

public class Main {

    public static void main(String[] args) {

        MotorController economy = new Economy();
        MotorController topspeed = new TopSpeed();
        MotorController superspar = new SuperSpar();

        Car car = new Car();

        car.addObserver(economy);
        car.addObserver(topspeed);
        car.addObserver(superspar);

        car.drive(12);
        car.drive(80);
        car.drive(175);

    }
}
