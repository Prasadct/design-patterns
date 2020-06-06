package com.prasadct.factoryMethodPattern.model.factory;

import com.prasadct.factoryMethodPattern.model.BankAccount;

public abstract class BankAccountFactory {
    public abstract BankAccount createAccount(String type);
}
