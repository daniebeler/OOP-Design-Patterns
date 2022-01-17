package com.daniebeler.heater;

public class AirConditioner implements Observer{

    @Override
    public void alarm(int temperature) {
        System.out.println("Started Air-Conditioner");
    }
}
