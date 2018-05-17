package com.playground.java.divya.logic;

public class Divisibility {
    public static void main(String[] args) {
        System.out.println("The numbers are: ");
        for (int i=1;i<=1000;i++){
            if ((i%2!=0)&&(i%7==0)){
                System.out.println(i);
            }
        }
    }
}
