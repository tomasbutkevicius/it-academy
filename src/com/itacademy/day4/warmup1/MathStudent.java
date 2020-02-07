package com.itacademy.day4.warmup1;

public class MathStudent extends Person implements Student {
    int studentNumber;
    Double averageMark;

    public MathStudent() {
    }

    public MathStudent(int studentNumber, Double averageMark) {
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public void study() {
        System.out.println("Calculating the probability to live successfully");
    }
}
