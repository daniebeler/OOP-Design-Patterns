package com.daniebeler.heater;

public class Salt implements Observer{

    @Override
    public void alarm(int temperature) {
        System.out.println("Started Salt");
    }
}
