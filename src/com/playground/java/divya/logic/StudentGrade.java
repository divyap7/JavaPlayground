package com.playground.java.divya.logic;


public class StudentGrade {
    String grade="";
    private String grade(int marks) {
        switch (marks / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                grade="F grade";
                break;
            case 5:
                grade="E grade";
                break;
            case 6:
                grade="D grade";
                break;
            case 7:
                grade="C grade";
                break;
            case 8:
                grade="B grade";
                break;
            case 9:
                grade="A grade";
                break;
            default:
                System.out.println("Invalid Marks");

        }
        return grade;
    }

    public static void main(String[] args) {
        StudentGrade grade = new StudentGrade();
        grade.grade(99);
        System.out.println(grade.grade);
    }
}
