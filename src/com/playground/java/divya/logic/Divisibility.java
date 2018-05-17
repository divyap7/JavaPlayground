package com.playground.java.divya.logic;

public class Divisibility {
    public void oddBySeven() {
        for (int i = 1; i <= 1000; i++) {
            if ((i % 2 != 0) && (i % 7 == 0)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The numbers are: ");
        Divisibility result = new Divisibility();
        result.oddBySeven();
    }
}
