package com.closingapp.closingsapp.models;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class FinancialInformation {

    @Id
    @GeneratedValue
    private int id;

    @NotNull(message = "Payoff Information is required.")
    private boolean payoff;

    @Size(max = 75, message = "Bank name must be under 75 characters.")
    private String bankName;

    @Size(min= 5,max = 20, message = "Incorrect Payoff Number")
    private String bankPayoffNumber;

    private boolean payoffReceived;


    public FinancialInformation(int id, boolean payoff, String bankName, String bankPayoffNumber, boolean payoffReceived) {
        this.id = id;
        this.payoff = payoff;
        this.bankName = bankName;
        this.bankPayoffNumber = bankPayoffNumber;
        this.payoffReceived = payoffReceived;
    }

    public FinancialInformation() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPayoff() {
        return payoff;
    }

    public void setPayoff(boolean payoff) {
        this.payoff = payoff;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankPayoffNumber() {
        return bankPayoffNumber;
    }

    public void setBankPayoffNumber(String bankPayoffNumber) {
        this.bankPayoffNumber = bankPayoffNumber;
    }

    public boolean isPayoffReceived() {
        return payoffReceived;
    }

    public void setPayoffReceived(boolean payoffReceived) {
        this.payoffReceived = payoffReceived;
    }
}
