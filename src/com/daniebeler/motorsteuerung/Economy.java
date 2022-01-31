package com.daniebeler.motorsteuerung;

public class Economy extends AbstractMotorController {


    public Economy() {
        super(0, 50);
    }

    public void drive() {
        System.out.println("Driving in Economy");
    }
}
