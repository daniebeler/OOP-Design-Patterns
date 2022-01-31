package com.daniebeler.motorsteuerung;

public class Economy implements MotorController {

    private int min = 0;
    private int max = 50;

    @Override
    public void drive(int speed) {
        if(speed >= min && speed <= max){
            System.out.println("Ich fahre Economy");
        }
    }
}
