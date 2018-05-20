package com.playground.java.divya.logic;

public class Sequences {
    private void sequence1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
        }
    }

    private void sequence2(int n) {
        for (int i = n; n >= 1; i--) {
            System.out.print(i);
            n = n - 1;
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
        }
    }


    private void sequence3(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i +"-"+n+"-");
            n--;
        }
    }

    private void sequence4(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print("0");
            }
        }
    }

    public static void main(String[] args) {
        Sequences sequence = new Sequences();
        sequence.sequence3(100);
        System.out.println();
        sequence.sequence4(5);
        System.out.println();
        sequence.sequence1(5);
        System.out.println();
        sequence.sequence2(5);

    }
}