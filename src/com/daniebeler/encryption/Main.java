package com.daniebeler.encryption;

public class Main {

    public static void main(String[] args) {

        Encrypter encrypter1 = new Caesar();
        Encrypter encrypter2 = new Reverse();

        System.out.println(encrypter1.encrypt("Hola"));
        System.out.println(encrypter2.encrypt("Guten Tag"));
    }
}
