package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //numeric value of the month = nMonth
        //word value of the month = wMonth
        System.out.println( "Please enter the number of the month: " );
        int nMonth = input.nextInt();

        String wMonth;
        switch(nMonth) {
            case 1 :
                wMonth = "January";
                break;
            case 2 :
                wMonth = "February";
                break;
            case 3 :
                wMonth = "March";
                break;
            case 4 :
                wMonth = "April";
                break;
            case 5 :
                wMonth = "May";
                break;
            case 6 :
                wMonth = "June";
                break;
            case 7 :
                wMonth = "July";
                break;
            case 8 :
                wMonth = "August";
                break;
            case 9 :
                wMonth = "September";
                break;
            case 10 :
                wMonth = "October";
                break;
            case 11 :
                wMonth = "November";
                break;
            case 12 :
                wMonth = "December";
                break;
            default :
                System.out.println("Input out of range");
                return;
        }
        System.out.printf("The name of the month is %s.", wMonth);
    }
}
