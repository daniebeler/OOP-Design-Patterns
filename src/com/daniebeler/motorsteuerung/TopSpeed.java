package com.daniebeler.motorsteuerung;

public class TopSpeed implements MotorController{
    @Override
    public void drive(int speed) {
        System.out.println("Ich fahre TopSpeed");
    }
}
