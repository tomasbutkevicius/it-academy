package com.itacademy.day4.warmup1;

public class Address {
    String street;
    String city;
    String state;
    int postalCode;
    String country;

    public Address(String street, String city, String state, int postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }
    public String getFormattedAddress(){
        String formattedAddress = "Street: " + street + "City: " + city + "\n" + "State: " + state + "Postal code: " + postalCode + "\n Country: " + country;
        return formattedAddress;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
