package com.prasadct.handler;

import com.prasadct.model.Person;

public interface Handler {
    public void validate(Person person);
    public void setNextCHandler(Handler handler);
}
