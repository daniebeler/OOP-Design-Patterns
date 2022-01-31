package com.daniebeler.motorsteuerung;

public class Economy implements MotorController {

    @Override
    public void drive(int speed) {
        System.out.println("Ich fahre Economy");
    }
}
