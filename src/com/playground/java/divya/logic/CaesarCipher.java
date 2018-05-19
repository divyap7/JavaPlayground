package com.playground.java.divya.logic;

public class CaesarCipher {
    private void cipher(String word) {
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char character = word.charAt(i);
            character = (char) (character + 3);
            System.out.print(character);
        }
    }

    public static void main(String[] args) {
        CaesarCipher cipher=new CaesarCipher();
        cipher.cipher("ABCDEF");

    }
}
