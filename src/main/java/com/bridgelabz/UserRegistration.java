package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRegistration {

    private final String FIRST_NAME_PATTERN="^[A-Z][a-z]{2,}$";

    public boolean userFirstName(String fristName) {

        return fristName.matches(FIRST_NAME_PATTERN);
    }
}
