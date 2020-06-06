package com.prasadct.factoryMethodPattern.model;

public class ForeignBusinessAccount implements BankAccount {
    String name = "Foreign Business account";

    @Override
    public void validateUserIdentity() {
        System.out.println(name + ": Validating identity");
    }

    @Override
    public void calculateInterestRate() {
        System.out.println(name + ": Calculating interest rate");
    }

    @Override
    public void registerAccount() {
        System.out.println(name + ": Registering account");
    }
}

