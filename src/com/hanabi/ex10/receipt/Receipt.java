package com.hanabi.ex10.receipt;

import com.hanabi.ex10.customer.Customer;

public class Receipt {

    private Customer customer;
    private int oldNumber;
    private int newNumber;
    private int money;

    public Receipt(Customer customer, int oldNumber, int newNumber) {
        this.customer = customer;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.money = (newNumber - oldNumber) * 750;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "customer=" + customer +
                ", oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                ", money=" + money +
                '}';
    }
}
