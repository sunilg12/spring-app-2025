package com.ourfirstapp.first_spring_app.model;

public class Address {

//    public int doorno;
//    public String streetName;
//    public String city;

    private int doorno;
    private String streetName;
    private String city;

    public Address(int doorno, String streetName, String city) {
        this.doorno = doorno;
        this.streetName = streetName;
        this.city = city;
    }

    public Address() {
    }

    public int getDoorno() {
        return doorno;
    }

    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorno=" + doorno +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
