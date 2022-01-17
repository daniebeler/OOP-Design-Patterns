package com.daniebeler.heater;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    List<Observer> observers = new ArrayList<>();

    public Sensor() {
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void alert(int temperatur){
        System.out.println("Temperatur: " + temperatur);
        observers.forEach(observer -> {
            observer.alarm(12);
        });
    }
}
