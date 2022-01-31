package com.daniebeler.motorsteuerung;

public class TopSpeed implements SpeedObserver{

    private int min = 51;
    private int max = 100;

    @Override
    public void alert(int speed) {
        if(speed >= min && speed <= max){
            System.out.println("Ich fahre Top Speed");
        }
    }
}
