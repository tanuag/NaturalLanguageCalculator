package com.ncr.assignment;

import com.ncr.assignment.utility.ExpressionInfixToPrefix;
import com.ncr.assignment.utility.ExpressionTree;

import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 * Class used to call utility classes and returns result
 */
public class CalculateExpression {

    /**
     * @param expression
     * @return result
     */
    public static String calculateExpression(String expression) {
        ArrayList<String> expressionInfix = new ArrayList<>();

        /** make object of ExpressionTree **/
        ExpressionTree et = new ExpressionTree();

        String resultString;

        try {
            expressionInfix = ExpressionInfixToPrefix.infixToPreFix(expression);

            et.buildTree(expressionInfix);

//            et.infix();

            Double result = et.evaluate();

            if (result != Infinity) {
                if (Math.ceil(result) == Math.floor(result)) {
                    int val = (int) Math.round(result);
                    resultString = Integer.toString(val);
                } else {
                    resultString = Double.toString(result);
                }
            } else {
                resultString = Double.toString(result);
            }

        } catch (Exception e) {
            resultString = "Error - " + e.getMessage();
        }

        return resultString;
    }
}
