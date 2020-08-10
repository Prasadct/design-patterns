package com.prasadct.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    //Each handler in the chain validate Person object and add message to this list.
    private List<String> validationMessages;

    private String username;
    private String email;
    private int age;
    private double accountBalance;

    public Person(String username, String email, int age, double accountBalance) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.accountBalance = accountBalance;
        validationMessages = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public List<String> getValidationMessages() {
        return validationMessages;
    }
}
