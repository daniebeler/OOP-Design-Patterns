package com.daniebeler.acceleration;

public class Main {

    public static void main(String[] args) {

        Acceleration accFastStart = new FastStart();
        Acceleration accFastEnd = new FastEnd();
        Acceleration accEqual = new Equal();

        Car car1 = new Car(accFastStart, "1");
        Car car2 = new Car(accFastEnd, "2");
        Motorcycle motorcycle1 = new Motorcycle(accFastStart, "1");
        Motorcycle motorcycle2 = new Motorcycle(accEqual, "2");

        System.out.println(car1.accelerate());
        System.out.println(car2.accelerate());
        System.out.println(motorcycle1.accelerate());
        System.out.println(motorcycle2.accelerate());
    }
}
