package com.closingapp.closingsapp.models;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
public class PropertyInformation {

    @Id
    @GeneratedValue
    private int id;

    @Size(max = 100, message = "Street address too long")
    @NotBlank(message="Street address is required")
    private String streetAddress;

    @Size(max=100, message="Street address is too long")
    private String streetAddress2;

    @Size(max=50, message="City is too long")
    @NotBlank(message="City is required")
    private String city;

    @Size(max=40, message="State is too long")
    @NotBlank(message="State is required")
    private String state;

    @NotBlank(message="Zip code is required")
    private int zipcode;

    @NotBlank(message="Parcel ID is required")
    private int parcelId;

    public PropertyInformation(int id, String streetAddress, String streetAddress2, String city, String state, int zipcode, int parcelId) {
        this.id = id;
        this.streetAddress = streetAddress;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.parcelId = parcelId;
    }

    public PropertyInformation() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
