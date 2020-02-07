package com.itacademy.day4.warmup1;

public class Professor extends Person{
    Double salary;

    public Professor(Double salary) {
        this.salary = salary;
    }

    public Professor(String name, Address address, String email, Boolean isAlive, Double salary) {
        super(name, address, email, isAlive);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
