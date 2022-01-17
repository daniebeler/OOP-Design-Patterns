package com.daniebeler.heater;

public class Heater implements Observer{
    @Override
    public void alarm(int temperature) {
        System.out.println("Started Heater");
    }
}
