package com.closingapp.closingsapp.models;

import java.util.ArrayList;

public class PropertyInformation {

    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String state;
    private int zipcode;
    private int parcelId;

    public PropertyInformation(String streetAddress, String streetAddress2, String city, String state, int zipcode, int parcelId) {
        this.streetAddress = streetAddress;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.parcelId = parcelId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getParcelId() {
        return parcelId;
    }

    public void setParcelId(int parcelId) {
        this.parcelId = parcelId;
    }
}
