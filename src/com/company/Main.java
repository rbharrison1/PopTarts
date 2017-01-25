package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console c = System.console();
        Date today = new Date();
        int input;

        System.out.print("Enter your age: ");
        input = Integer.parseInt(c.readLine());

        Calendar lower = Calendar.getInstance();
        lower.setTime(today);
        Calendar upper = Calendar.getInstance();
        upper.setTime(today);

        lower.add(Calendar.YEAR,-input - 1);
        upper.add(Calendar.YEAR, -input);
        lower.add(Calendar.DAY_OF_MONTH, 1);

        Date lowerBound = lower.getTime();
        Date upperBound = upper.getTime();

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String lString = df.format(lowerBound);
        String uString = df.format(upperBound);

        System.out.printf("You were born between the dates of " + lString + " and " + uString + ".");
    }
}
