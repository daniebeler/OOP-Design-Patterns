package com.daniebeler.motorsteuerung;

import java.util.ArrayList;
import java.util.List;

public class Car {

    List<MotorController> observers = new ArrayList<>();

    public void addObserver(MotorController os) {
        this.observers.add(os);
    }

    public void drive(int speed){
        observers.forEach(observer -> {
            observer.drive(speed);
        });

    }
}
