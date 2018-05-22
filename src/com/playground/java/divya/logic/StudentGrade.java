package com.playground.java.divya.logic;


public class StudentGrade {
    private void grade(int marks) {

        if(marks>=0 && marks<=49){
            System.out.println("F Grade");
        }else if (marks>=50 && marks<=59){
            System.out.println("E Grade");
        }else if (marks>=60 && marks<=69) {
            System.out.println("D Grade");
        }else if (marks>=70 && marks<=79) {
            System.out.println("C Grade");
        }else if (marks>=80 && marks<=89) {
            System.out.println("B Grade");
        }else if (marks>=90 && marks<=100) {
            System.out.println("A Grade");
        }else{
            System.out.println("Invalid Marks");
        }
    }

    public static void main(String[] args) {
        StudentGrade grade = new StudentGrade();
        grade.grade(72);
    }
}
