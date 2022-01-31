package com.daniebeler.motorsteuerung;

public class SuperSpar implements SpeedObserver{

    private int min = 101;
    private int max = 200;

    @Override
    public void alert(int speed) {
        if(speed >= min && speed <= max){
            System.out.println("Ich fahre SuperSpar");
        }
    }
}
