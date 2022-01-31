package com.daniebeler.motorsteuerung;

public class TopSpeed extends AbstractMotorController{

    public TopSpeed() {
        super(51, 100);
    }

    public void drive() {
        System.out.println("Driving in TopSpeed");
    }
}
