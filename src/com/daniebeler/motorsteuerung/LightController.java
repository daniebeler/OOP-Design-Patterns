package com.daniebeler.motorsteuerung;

public class LightController implements SpeedObserver {

    @Override
    public void rangeReached(int speed) {
        System.out.println("Informed LightController");
    }
}
