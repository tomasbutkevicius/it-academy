package com.itacademy.day4.warmup1;

public class PersonApp {
    public static void main(String[] args) {
        MathStudent student = new MathStudent();
//        student = new Person("John Obama", new Address("Fried Chicken st.", "New Boris", "West Virginia", 144, "USA"), "barbara@gmail.com", true);
        //student.setAddress(new Address("Fried Chicken st.", "New Boris", "West Virginia", 144, "USA"));
        student.setName("John");
        student.setEmail("barbara@gmail.com");
        student.setAlive(true);
        student.study();
        Professor professor = new Professor("Leo Peterson", new Address("Clean Room st.", "Washington DC", "Yes", 4646, "USA"), "godisttot@gmail.com", true, 1444.00);

    }
}
