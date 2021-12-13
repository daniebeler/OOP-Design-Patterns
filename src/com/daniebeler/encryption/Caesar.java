package com.daniebeler.encryption;

public class Caesar implements Encrypter{

    @Override
    public String encrypt(String plain) {
        return plain + " (encrypted by Ceasar)";
    }
}
