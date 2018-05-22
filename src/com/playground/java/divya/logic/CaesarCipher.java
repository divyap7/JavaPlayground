package com.playground.java.divya.logic;

public class CaesarCipher {
    private void encode(String word)

    {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                char ch = (char) (((int) word.charAt(i) +
                        3 - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) word.charAt(i) +
                        3 - 97) % 26 + 97);
                result.append(ch);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        cipher.encode("yza");

    }
}
