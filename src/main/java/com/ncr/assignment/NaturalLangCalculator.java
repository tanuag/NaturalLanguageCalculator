package com.ncr.assignment;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;


public class NaturalLangCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        boolean anotherCalculation = true;

        while (anotherCalculation) {

            System.out.println("\nPlease enter a calculation");

            Double result = CalculateExpression.calculateExpression(scan.nextLine());

            if(result==-999999.9999){
                continue;
            }

            if (result != Infinity) {
                if (Math.ceil(result) == Math.floor(result)) {
                    int val = (int) Math.round(result);
                    System.out.println("\n\nResult: " + val);
                } else {

                    System.out.println("\n\nResult: " + result);
                }
            } else {

                System.out.println("\n\nResult: " + result);
            }

            System.out.println("\nTo exit, please type exit or to continue, please press enter");

            if (scan.nextLine().equalsIgnoreCase("exit")) {
                anotherCalculation = false;
            }


        }


    }
}
