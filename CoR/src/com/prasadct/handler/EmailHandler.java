package com.prasadct.handler;

import com.prasadct.model.Person;

public class EmailHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void validate(Person person) {
        if ( person.getEmail() == null ){
            person.getValidationMessages().add("Email cannot be empty");
        } else if ( !person.getEmail().contains("@")){
            person.getValidationMessages().add("Invalid email address");
        }

        //Pass to next handler
        nextHandler.validate(person);
    }

    @Override
    public void setNextCHandler(Handler handler) {
        nextHandler = handler;
    }
}
