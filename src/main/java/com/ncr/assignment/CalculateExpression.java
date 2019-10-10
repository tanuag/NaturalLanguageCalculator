package com.ncr.assignment;

import com.ncr.assignment.utility.ExpressionInfixToPrefix;
import com.ncr.assignment.utility.ExpressionTree;

import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class CalculateExpression {

    public static Double calculateExpression(String expression) {
        ArrayList<String> expressionInfix = new ArrayList<>();

        /** make object of ExpressionTree **/
        ExpressionTree et = new ExpressionTree();

        try {
            expressionInfix = ExpressionInfixToPrefix.infixToPreFix(expression);

            et.buildTree(expressionInfix);

            et.infix();

            Double result = et.evaluate();

            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -999999.9999;
        }
    }
}
