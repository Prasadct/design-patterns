package com.prasadct.factoryMethodPattern.model.factory;

import com.prasadct.factoryMethodPattern.model.BankAccount;
import com.prasadct.factoryMethodPattern.model.LocalBusinessAccount;
import com.prasadct.factoryMethodPattern.model.LocalCheckingAccount;
import com.prasadct.factoryMethodPattern.model.LocalPersonalAccount;

public class LocalBankAccountFactory extends BankAccountFactory{

    @Override
    public BankAccount createAccount(String type) {
        BankAccount bankAccount = null;
        if (type.equals("P")){
            bankAccount = new LocalPersonalAccount();
        } else if (type.equals("B")){
            bankAccount = new LocalBusinessAccount();
        } else if (type.equals("C")){
            bankAccount = new LocalCheckingAccount();
        } else {
            System.out.println("Invalid input");
        }
        return bankAccount;
    }
}
