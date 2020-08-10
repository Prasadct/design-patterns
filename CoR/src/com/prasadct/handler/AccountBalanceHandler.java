package com.prasadct.handler;

import com.prasadct.model.Person;

public class AccountBalanceHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void validate(Person person) {
        if ( person.getAccountBalance() < 1000 ){
            person.getValidationMessages().add("Your account balance is not sufficient");
        }

        //Since this is last handler of the chain, there is no next handler to pass the request
    }

    @Override
    public void setNextCHandler(Handler handler) {
        nextHandler = handler;
    }
}
