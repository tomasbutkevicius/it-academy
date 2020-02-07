package com.itacademy.day4.warmup1;

public class Person {
    String name;
    Address address;
    String email;
    Boolean isAlive;

    public Person() {
    }

    public Person(String name, Address address, String email, Boolean isAlive) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public void doStuff(){
        System.out.println("Drinking coffee");
    }
}
