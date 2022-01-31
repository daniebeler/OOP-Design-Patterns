package com.daniebeler.motorsteuerung;

import com.daniebeler.heater.Observer;
import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private MotorController mc;

    List<MotorController> observers = new ArrayList<>();

    public void addObserver(MotorController os) {
        this.observers.add(os);
    }

    public void setMc(MotorController mc) {
        this.mc = mc;
    }

    public void drive(int speed){
        if(speed <= 50) {
            setMc(new Economy());
        }
        else if(speed <= 100){
            this.setMc(new TopSpeed());
        }
        else if(speed <= 200) {
            this.setMc(new SuperSpar());
        }

        this.mc.drive(speed);
    }
}
