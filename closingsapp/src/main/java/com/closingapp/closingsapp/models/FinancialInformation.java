package com.closingapp.closingsapp.models;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FinancialInformation {

    @NotNull(message = "Payoff Information is required.")
    private boolean payoff;

    @Size(max = 75, message = "Bank name must be under 75 characters.")
    private String bankName;

    @Range(min= 5,max = 20, message = "Incorrect Payoff Number")
    private int bankPayoffNumber;

    private boolean payoffReceived;

    public FinancialInformation(boolean payoff, String bankName, int bankPayoffNumber, boolean payoffReceived) {
        this.payoff = payoff;
        this.bankName = bankName;
        this.bankPayoffNumber = bankPayoffNumber;
        this.payoffReceived = payoffReceived;
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

    public int getBankPayoffNumber() {
        return bankPayoffNumber;
    }

    public void setBankPayoffNumber(int bankPayoffNumber) {
        this.bankPayoffNumber = bankPayoffNumber;
    }

    public boolean isPayoffReceived() {
        return payoffReceived;
    }

    public void setPayoffReceived(boolean payoffReceived) {
        this.payoffReceived = payoffReceived;
    }
}
