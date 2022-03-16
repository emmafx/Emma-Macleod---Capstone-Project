package com.closingapp.closingsapp.models;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class RealtorInformation {

    @Id
    @GeneratedValue
    private int id;

    @Size(max = 50, message = "Name must be under 50 characters.")
    private String buyersAgentFirstName;

    @Size(max = 50, message = "Name must be under 50 characters.")
    private String buyersAgentLastName;

    @Size(min = 10, max = 11, message = "Phone number must be between 10-11 numbers.")
    private String buyersAgentPhoneNumber;

    @Email
    private String buyersAgentEmail;

    @Size(max = 75, message = "Brokerage firm must be under 75 characters.")
    private String buyersAgentBrokerageFirm;

    @Range(max = 10, message = "Commission must under 10 percent.")
    private int buyersAgentCommission;

    @Size(max = 50, message = "Name must be under 50 characters.")
    private String sellersAgentFirstName;

    @Size(max = 50, message = "Name must be under 50 characters.")
    private String sellersAgentLastName;

    @Size(min = 10, max = 11, message = "Phone number must be between 10-11 numbers.")
    private String sellersAgentPhoneNumber;

    @Email
    private String sellersAgentEmail;

    @Size(max = 75, message = "Brokerage firm must be under 75 characters.")
    private String sellersAgentBrokerageFirm;

    @Range(max = 10, message = "Commission must under 10 percent.")
    private int sellersAgentCommission;



    public RealtorInformation() {
    }

    public RealtorInformation(int id, String buyersAgentFirstName, String buyersAgentLastName, String buyersAgentPhoneNumber, String buyersAgentEmail, String buyersAgentBrokerageFirm, int buyersAgentCommission, String sellersAgentFirstName, String sellersAgentLastName, String sellersAgentPhoneNumber, String sellersAgentEmail, String sellersAgentBrokerageFirm, int sellersAgentCommission) {
        this.id = id;
        this.buyersAgentFirstName = buyersAgentFirstName;
        this.buyersAgentLastName = buyersAgentLastName;
        this.buyersAgentPhoneNumber = buyersAgentPhoneNumber;
        this.buyersAgentEmail = buyersAgentEmail;
        this.buyersAgentBrokerageFirm = buyersAgentBrokerageFirm;
        this.buyersAgentCommission = buyersAgentCommission;
        this.sellersAgentFirstName = sellersAgentFirstName;
        this.sellersAgentLastName = sellersAgentLastName;
        this.sellersAgentPhoneNumber = sellersAgentPhoneNumber;
        this.sellersAgentEmail = sellersAgentEmail;
        this.sellersAgentBrokerageFirm = sellersAgentBrokerageFirm;
        this.sellersAgentCommission = sellersAgentCommission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuyersAgentFirstName() {
        return buyersAgentFirstName;
    }

    public void setBuyersAgentFirstName(String buyersAgentFirstName) {
        this.buyersAgentFirstName = buyersAgentFirstName;
    }

    public String getBuyersAgentLastName() {
        return buyersAgentLastName;
    }

    public void setBuyersAgentLastName(String buyersAgentLastName) {
        this.buyersAgentLastName = buyersAgentLastName;
    }

    public String getBuyersAgentPhoneNumber() {
        return buyersAgentPhoneNumber;
    }

    public void setBuyersAgentPhoneNumber(String buyersAgentPhoneNumber) {
        this.buyersAgentPhoneNumber = buyersAgentPhoneNumber;
    }

    public String getBuyersAgentEmail() {
        return buyersAgentEmail;
    }

    public void setBuyersAgentEmail(String buyersAgentEmail) {
        this.buyersAgentEmail = buyersAgentEmail;
    }

    public String getBuyersAgentBrokerageFirm() {
        return buyersAgentBrokerageFirm;
    }

    public void setBuyersAgentBrokerageFirm(String buyersAgentBrokerageFirm) {
        this.buyersAgentBrokerageFirm = buyersAgentBrokerageFirm;
    }

    public int getBuyersAgentCommission() {
        return buyersAgentCommission;
    }

    public void setBuyersAgentCommission(int buyersAgentCommission) {
        this.buyersAgentCommission = buyersAgentCommission;
    }

    public String getSellersAgentFirstName() {
        return sellersAgentFirstName;
    }

    public void setSellersAgentFirstName(String sellersAgentFirstName) {
        this.sellersAgentFirstName = sellersAgentFirstName;
    }

    public String getSellersAgentLastName() {
        return sellersAgentLastName;
    }

    public void setSellersAgentLastName(String sellersAgentLastName) {
        this.sellersAgentLastName = sellersAgentLastName;
    }

    public String getSellersAgentPhoneNumber() {
        return sellersAgentPhoneNumber;
    }

    public void setSellersAgentPhoneNumber(String sellersAgentPhoneNumber) {
        this.sellersAgentPhoneNumber = sellersAgentPhoneNumber;
    }

    public String getSellersAgentEmail() {
        return sellersAgentEmail;
    }

    public void setSellersAgentEmail(String sellersAgentEmail) {
        this.sellersAgentEmail = sellersAgentEmail;
    }

    public String getSellersAgentBrokerageFirm() {
        return sellersAgentBrokerageFirm;
    }

    public void setSellersAgentBrokerageFirm(String sellerAgentBrokerageFirm) {
        this.sellersAgentBrokerageFirm = sellersAgentBrokerageFirm;
    }

    public int getSellersAgentCommission() {
        return sellersAgentCommission;
    }

    public void setSellersAgentCommission(int sellersAgentCommission) {
        this.sellersAgentCommission = sellersAgentCommission;
    }
}
