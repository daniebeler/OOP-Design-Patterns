package com.daniebeler.motorsteuerung;

import java.util.ArrayList;
import java.util.List;

public class Car {

    List<SpeedObserver> observers = new ArrayList<>();

    public void addObserver(SpeedObserver so) {
        this.observers.add(so);
    }

    public void drive(int speed){
        observers.forEach(observer -> {
            observer.alert(speed);
        });

    }
}
