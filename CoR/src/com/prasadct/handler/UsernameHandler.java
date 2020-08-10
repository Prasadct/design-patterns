package com.prasadct.handler;

import com.prasadct.model.Person;

public class UsernameHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void validate(Person person) {
        if ( person.getUsername() == null ){
            person.getValidationMessages().add("Username cannot be empty");
        } else if ( person.getUsername().length() < 3 ){
            person.getValidationMessages().add("Username cannot be less than 3 characters");
        }

        //Pass to next handler
        nextHandler.validate(person);
    }

    @Override
    public void setNextCHandler(Handler handler) {
        nextHandler = handler;
    }
}
