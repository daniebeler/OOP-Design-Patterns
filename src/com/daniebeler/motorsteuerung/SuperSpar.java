package com.daniebeler.motorsteuerung;

public class SuperSpar extends AbstractMotorController{

    public SuperSpar() {
        super(101, 200);
    }

    public void drive() {
        System.out.println("Driving in SuperSpar");
    }
}
