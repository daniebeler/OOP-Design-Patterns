package com.daniebeler.motorsteuerung;

public class LightController implements SpeedObserver{

    @Override
    public void alert(int speed) {
        System.out.println("Lichtsteuerung wurde alarmiert");
    }
}
