package com.ncr.assignment.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ExpressionInfixToPrefix {

    static int precedence(String c) {
        switch (c) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
        }
        return -1;
    }


    public static ArrayList<String> infixToPreFix(String expression) throws Exception {

        ArrayList<String> resultArr = new ArrayList<>();


        String[] exprArray = expression.split(" ");

        String[] stringExp = new String[exprArray.length];

        for (int i = 0; i < exprArray.length; i++) {
            if (TextToNumberOperatorConvertor.textnumberMap.containsKey(exprArray[i].toLowerCase()))
                stringExp[i] = TextToNumberOperatorConvertor.textnumberMap.get(exprArray[i].toLowerCase());
            else
                throw new Exception("'" + exprArray[i] + "' is invalid value.");
        }


        Stack<String> stack = new Stack<>();


        for (int i = stringExp.length - 1; i >= 0; i--) {
            String c = stringExp[i];

            //check if char is operator or operand
            if (precedence(c) > 0) {
                if (precedence(c) == 1) {
                    while (stack.isEmpty() == false && precedence(stack.peek()) == 2) {
                        resultArr.add(stack.pop());
                    }
                }
                stack.push(c);
            } else {
                resultArr.add(c);
            }
        }
        while (stack.isEmpty() == false) {
            resultArr.add(stack.pop());
        }

        Collections.reverse(resultArr);


        return resultArr;
    }
}
