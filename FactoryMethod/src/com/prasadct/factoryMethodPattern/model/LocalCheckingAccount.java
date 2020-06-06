package com.prasadct.factoryMethodPattern.model;

public class LocalCheckingAccount implements BankAccount {
    String name = "Local Checking account";

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
