package com.prasadct.factoryMethodPattern;

import com.prasadct.factoryMethodPattern.model.BankAccount;
import com.prasadct.factoryMethodPattern.model.factory.BankAccountFactory;

public class Branch {

    private BankAccountFactory bankAccountFactory;

    public Branch(BankAccountFactory bankAccountFactory){
        this.bankAccountFactory = bankAccountFactory;
    }

    public BankAccount createBankAccount(String type) {
        BankAccount bankAccount = null;
        bankAccount = bankAccountFactory.createAccount(type);
        bankAccount.validateUserIdentity();
        bankAccount.calculateInterestRate();
        bankAccount.registerAccount();

        return bankAccount;
    }
}
