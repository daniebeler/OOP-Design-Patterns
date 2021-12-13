package com.daniebeler.encryption;

public class Reverse implements Encrypter{

    @Override
    public String encrypt(String plain) {
        return plain + " (encrypted by Reverse)";
    }
}
