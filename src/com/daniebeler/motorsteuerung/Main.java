package com.daniebeler.motorsteuerung;

public class Main {

    public static void main(String[] args) {

        SpeedObserver economy = new Economy();
        SpeedObserver topspeed = new TopSpeed();
        SpeedObserver superspar = new SuperSpar();
        SpeedObserver light = new LightController();

        Car car = new Car();

        car.addObserver(economy);
        car.addObserver(topspeed);
        car.addObserver(superspar);

        car.addObserver(light);

        car.drive(12);
        car.drive(80);
        car.drive(175);

    }
}
