package com.playground.java.divya.logic;

public class Divisibility {
    private void oddBySeven(int x,int y) {
        for (int i = x; i <= y; i++) {
            if ((i % 2 != 0) && (i % 7 == 0)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The numbers are: ");
        Divisibility result = new Divisibility();
        result.oddBySeven(2,100);
    }
}
