package com.ncr.assignment;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;


/**
 * Main class to run natural language calculator
 */
public class NaturalLangCalculator {

    /**
     * Main method to run the application
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        boolean anotherCalculation = true;

        while (anotherCalculation) {

            System.out.println("\nPlease enter a calculation");

            System.out.println("\nResult: " + CalculateExpression.calculateExpression(scan.nextLine()));

            System.out.println("\nTo exit, please type exit or To continue, please press enter");

            if (scan.nextLine().equalsIgnoreCase("exit")) {
                anotherCalculation = false;
            }


        }


    }
}
