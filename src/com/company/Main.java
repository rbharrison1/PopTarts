package com.company;

//import java.util.Date;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console c = System.console();
        String input = " ";
        //Date today = new Date();

        System.out.print("Enter your age: ");
        input = c.readLine();

        c.printf(input);
    }
}
