package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRegistration {

    private final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    private final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    private final String EMAIL_ID_PATTERN = "^([a-zA-Z0-9]{1,}[._+-]?[0-9a-zA-Z]{1,})[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,3}){1,2}$";

    public boolean userFirstName(String fristName) {

        return fristName.matches(FIRST_NAME_PATTERN);
    }

    public boolean userLastName(String lastName) {

        return lastName.matches(LAST_NAME_PATTERN);
    }

    public boolean userEmailId(String emailId) {

        return emailId.matches(EMAIL_ID_PATTERN);
    }
}
