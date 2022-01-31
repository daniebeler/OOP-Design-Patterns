package com.daniebeler.motorsteuerung;

public abstract class AbstractMotorController implements SpeedObserver {

    protected int min;
    protected int max;

    public AbstractMotorController(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void rangeReached(int speed){
        if(speed >= min && speed <= max){
            drive();
        }
    }

    public abstract void drive();
}
