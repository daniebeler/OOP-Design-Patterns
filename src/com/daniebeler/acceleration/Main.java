package com.daniebeler.acceleration;

public class Main {

    public static void main(String[] args) {

        Acceleration car1 = new FastStart();
        Acceleration car2 = new FastEnd();
        Acceleration motorcycle1 = new FastStart();
        Acceleration motorcycle2 = new Equal();

        System.out.println("Auto 1: " + car1.accelerate());
        System.out.println("Auto 2: " + car2.accelerate());
        System.out.println("Motorrad 1: " + motorcycle1.accelerate());
        System.out.println("Motorrad 2: " + motorcycle2.accelerate());
    }
}
