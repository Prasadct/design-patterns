package com.prasadct.factoryMethodPattern.model.factory;

import com.prasadct.factoryMethodPattern.model.*;

public class ForeignBankAccountFactory extends BankAccountFactory{

    @Override
    public BankAccount createAccount(String type) {
        BankAccount bankAccount = null;
        if (type.equals("P")){
            bankAccount = new ForeignPersonalAccount();
        } else if (type.equals("B")){
            bankAccount = new ForeignPersonalAccount();
        } else if (type.equals("C")){
            bankAccount = new ForeignPersonalAccount();
        } else {
            System.out.println("Invalid input");
        }
        return bankAccount;
    }
}
