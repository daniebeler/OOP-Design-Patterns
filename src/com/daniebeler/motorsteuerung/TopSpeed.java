package com.daniebeler.motorsteuerung;

public class TopSpeed implements MotorController{

    private int min = 51;
    private int max = 100;

    @Override
    public void drive(int speed) {
        if(speed >= min && speed <= max){
            System.out.println("Ich fahre Top Speed");
        }
    }
}
