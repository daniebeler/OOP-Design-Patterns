package com.daniebeler.heater;

public class Main {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.addObserver(new Salt());
        sensor.addObserver(new Heater());
        sensor.addObserver(new AirConditioner());

        sensor.alert(12);
    }
}
