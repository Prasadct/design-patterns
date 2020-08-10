package com.prasadct.handler;

import com.prasadct.model.Person;

public class AgeHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void validate(Person person) {
        if ( person.getAge() < 16 ){
            person.getValidationMessages().add("You are not allowed to access this service");
        }

        //Pass to next handler
        nextHandler.validate(person);
    }

    @Override
    public void setNextCHandler(Handler handler) {
        nextHandler = handler;
    }
}
