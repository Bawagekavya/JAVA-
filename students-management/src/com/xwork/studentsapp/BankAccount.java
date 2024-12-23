package com.xwork.studentsapp;

public class BankAccount {

    private String bankName;
    private double balance;
    private String address;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", balance=" + balance +
                ", address='" + address + '\'' +
                '}';
    }
}
