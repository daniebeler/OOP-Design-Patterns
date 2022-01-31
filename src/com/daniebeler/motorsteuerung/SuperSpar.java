package com.daniebeler.motorsteuerung;

public class SuperSpar implements MotorController{

    @Override
    public void drive(int speed) {
        System.out.println("Ich fahre SuperSpar");
    }
}
