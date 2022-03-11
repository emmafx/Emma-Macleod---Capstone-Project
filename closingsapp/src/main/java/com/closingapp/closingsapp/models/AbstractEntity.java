package com.closingapp.closingsapp.models;

import org.hibernate.validator.constraints.Range;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.*;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    @Size(max = 50, message = "Name must be under 50 characters.")
    @NotBlank(message = "First name is required.")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 50, message = "Last name must be under 50 characters.")
    private String lastName;

    @Size(max = 50, message = "Name must be under 50 characters.")
    private String secondFirstName;

    @Size(max = 50, message = "Last name must be under 50 characters.")
    private String secondLastName;

    @Size(min = 10, max = 11, message = "Must be between 10-11 characters.")
    @NotBlank(message = "Phone number is required.")
    private String contactNumber;

    @Email
    @NotBlank(message = "Email is required.")
    private String email;

    @Size(max = 50)
    private String realtorFirstName;

    @Size(max = 50)
    private String realtorLastName;

    public AbstractEntity(String firstName, String lastName, String secondFirstName, String secondLastName, String contactNumber, String email, String realtorFirstName, String realtorLastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondFirstName = secondFirstName;
        this.secondLastName = secondLastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.realtorFirstName = realtorFirstName;
        this.realtorLastName = realtorLastName;
        this.id = id;
    }

    protected AbstractEntity() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondFirstName() {
        return secondFirstName;
    }

    public void setSecondFirstName(String secondFirstName) {
        this.secondFirstName = secondFirstName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealtorFirstName() {
        return realtorFirstName;
    }

    public void setRealtorFirstName(String realtorFirstName) {
        this.realtorFirstName = realtorFirstName;
    }

    public String getRealtorLastName() {
        return realtorLastName;
    }

    public void setRealtorLastName(String realtorLastName) {
        this.realtorLastName = realtorLastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity entity = (AbstractEntity) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

