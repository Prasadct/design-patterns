package com.prasadct;

import com.prasadct.handler.*;
import com.prasadct.model.Person;

public class Main {

    public static void main(String[] args) {
        //Declaring handlers
        Handler usernameHandler = new UsernameHandler();
        Handler emailHandler = new EmailHandler();
        Handler ageHandler = new AgeHandler();
        Handler accountBalanceHandler = new AccountBalanceHandler();

        //Declaring chain
        usernameHandler.setNextCHandler(emailHandler);
        emailHandler.setNextCHandler(ageHandler);
        ageHandler.setNextCHandler(accountBalanceHandler);

        Person person = new Person("prasadct", "prasadct", 12, 9000);

        //Calling the first node of the chain
        usernameHandler.validate(person);

        //Printing the output of the chain of handlers
        for (String validateMessage :
                person.getValidationMessages()) {
            System.out.println(validateMessage);
        }
    }
}
