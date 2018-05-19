package com.playground.java.divya.logic;

public class CaesarCipher {
    private void encode(String word)

    {
        String encryptedMessage = "";
        for (int i = 0; i < word.length(); i++) {
            int letter = word.charAt(i);
            if (Character.isUpperCase(letter)) {
                letter = letter + 3;
                if (letter > 'Z')
                    letter = letter - 26;
            } else if (Character.isLowerCase(letter)) {
                letter = letter + 3;
                if (letter > 'z')
                    letter = letter - 26;
            }
            encryptedMessage += (char) letter;
        }
        System.out.print(encryptedMessage);
    }

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        cipher.encode("xyz");

    }
}
