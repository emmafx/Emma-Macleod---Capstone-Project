package com.closingapp.closingsapp.models;

public class Closing {

 private BuyersInformation buyersInformation;

 private SellersInformation sellersInformation;

 private PropertyInformation propertyInformation;

 private FinancialInformation financialInformation;

 private HOAInformation hoaInformation;

 public Closing(BuyersInformation buyersInformation, SellersInformation sellersInformation, PropertyInformation propertyInformation, FinancialInformation financialInformation, HOAInformation hoaInformation) {
  this.buyersInformation = buyersInformation;
  this.sellersInformation = sellersInformation;
  this.propertyInformation = propertyInformation;
  this.financialInformation = financialInformation;
  this.hoaInformation = hoaInformation;
 }

 public BuyersInformation getBuyersInformation() {
  return buyersInformation;
 }

 public void setBuyersInformation(BuyersInformation buyersInformation) {
  this.buyersInformation = buyersInformation;
 }

 public SellersInformation getSellersInformation() {
  return sellersInformation;
 }

 public void setSellersInformation(SellersInformation sellersInformation) {
  this.sellersInformation = sellersInformation;
 }

 public PropertyInformation getPropertyInformation() {
  return propertyInformation;
 }

 public void setPropertyInformation(PropertyInformation propertyInformation) {
  this.propertyInformation = propertyInformation;
 }

 public FinancialInformation getFinancialInformation() {
  return financialInformation;
 }

 public void setFinancialInformation(FinancialInformation financialInformation) {
  this.financialInformation = financialInformation;
 }

 public HOAInformation getHoaInformation() {
  return hoaInformation;
 }

 public void setHoaInformation(HOAInformation hoaInformation) {
  this.hoaInformation = hoaInformation;
 }
}



