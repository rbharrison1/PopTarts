package com.company;

import java.util.Calendar;
import java.util.Date;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console c = System.console();
        String input;

        System.out.print("Enter your age: ");
        input = c.readLine();

        int lowerMonth = Calendar.MONTH;
        int upperMonth = Calendar.MONTH;
        int lowerDay = Calendar.DAY_OF_MONTH + 1;
        int upperDay = Calendar.DAY_OF_MONTH;
        int lowerYear = Calendar.YEAR - Integer.parseInt(input) - 1;
        int upperYear = Calendar.YEAR - Integer.parseInt(input);

        System.out.printf("You were born between the dates of " + lowerMonth + " " + lowerDay + ", " + lowerYear + " and " + upperMonth + " " + upperDay + ", " + upperYear + ".");
    }
}
