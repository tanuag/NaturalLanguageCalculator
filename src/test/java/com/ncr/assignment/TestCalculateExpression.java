package com.ncr.assignment;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculateExpression {

    @Test
    public void testCalculateExpression() {
        String actualResult = CalculateExpression.calculateExpression("one plus two");
        String expectedResult = "3";

        Assert.assertEquals(expectedResult, actualResult);

    }


    @Test
    public void testCalculateExpressionInvalidExpression() {
        String actualResult = CalculateExpression.calculateExpression("one plus ttt");
        String expectedResult = "Error - Invalid expression : 'ttt' is invalid value.";

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCalculateUpperCase() {
        String actualResult = CalculateExpression.calculateExpression("ONE PLUS TWO");
        String expectedResult = "3";

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateOperationChain() {
        String actualResult = CalculateExpression.calculateExpression("four minus eight plus six times nine");
        String expectedResult = "50";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateTenPlusZero() {
        String actualResult = CalculateExpression.calculateExpression("zero plus ten");
        String expectedResult = "10";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateAdd() {
        String actualResult = CalculateExpression.calculateExpression("three Add five");
        String expectedResult = "8";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateplus() {
        String actualResult = CalculateExpression.calculateExpression("nine plus five");
        String expectedResult = "14";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateSubtract() {
        String actualResult = CalculateExpression.calculateExpression("five subtract eight");
        String expectedResult = "-3";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateMinus() {
        String actualResult = CalculateExpression.calculateExpression("nine minus four");
        String expectedResult = "5";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateLess() {
        String actualResult = CalculateExpression.calculateExpression("nine less four");
        String expectedResult = "5";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateMultipliedBy() {
        String actualResult = CalculateExpression.calculateExpression("nine multiplied-by four");
        String expectedResult = "36";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateTimes() {
        String actualResult = CalculateExpression.calculateExpression("nine times four");
        String expectedResult = "36";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateDividedBy() {
        String actualResult = CalculateExpression.calculateExpression("nine divided-by four");
        String expectedResult = "2.25";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateOver() {
        String actualResult = CalculateExpression.calculateExpression("nine Over four");

        String expectedResult = "2.25";

        Assert.assertEquals(expectedResult, actualResult);
    }
}
