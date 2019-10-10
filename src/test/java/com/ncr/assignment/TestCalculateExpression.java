package com.ncr.assignment;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculateExpression {

    @Test
    public void testCalculateExpression(){
        Double result = CalculateExpression.calculateExpression("one plus two");
        Assert.assertTrue("testCalculateExpression success",3==result);

    }


    @Test
    public void testCalculateExpressionInvalidExpression(){
        Double result = CalculateExpression.calculateExpression("one plus ttt");
        Assert.assertTrue("testCalculateExpressionInvalidExpression success",-999999.9999==result);

    }

    @Test
    public void testCalculateUpperCase(){
        Double result = CalculateExpression.calculateExpression("ONE PLUS TWO");
        Assert.assertTrue("testCalculateExpression success",3==result);
    }

    @Test
    public void testCalculateOperationChain(){
        Double result = CalculateExpression.calculateExpression("four minus eight plus six times nine");
        Assert.assertTrue("testCalculateExpression success",50==result);
    }

    @Test
    public  void testCalculateTenPlusZero(){
        Double result = CalculateExpression.calculateExpression("zero plus ten");
        Assert.assertTrue("testCalculateExpression success",10==result);
    }

    @Test
    public  void testCalculateAdd(){
        Double result = CalculateExpression.calculateExpression("three Add five");
        Assert.assertTrue("testCalculateExpression success",8==result);
    }

    @Test
    public  void testCalculateplus(){
        Double result = CalculateExpression.calculateExpression("nine plus five");
        Assert.assertTrue("testCalculateExpression success",14==result);
    }

    @Test
    public  void testCalculateSubtract(){
        Double result = CalculateExpression.calculateExpression("five subtract eight");
        Assert.assertTrue("testCalculateExpression success",-3==result);
    }

    @Test
    public  void testCalculateMinus(){
        Double result = CalculateExpression.calculateExpression("nine minus four");
        Assert.assertTrue("testCalculateExpression success",5==result);
    }

    @Test
    public  void testCalculateLess(){
        Double result = CalculateExpression.calculateExpression("nine less four");
        Assert.assertTrue("testCalculateExpression success",5==result);
    }

    @Test
    public  void testCalculateMultipliedBy(){
        Double result = CalculateExpression.calculateExpression("nine multiplied-by four");
        Assert.assertTrue("testCalculateExpression success",36==result);
    }

    @Test
    public  void testCalculateTimes(){
        Double result = CalculateExpression.calculateExpression("nine times four");
        Assert.assertTrue("testCalculateExpression success",36==result);
    }

    @Test
    public  void testCalculateDividedBy(){
        Double result = CalculateExpression.calculateExpression("nine divided-by four");
        Assert.assertTrue("testCalculateExpression success",2.25==result);
    }

    @Test
    public  void testCalculateOver(){
        Double result = CalculateExpression.calculateExpression("nine Over four");
        Assert.assertTrue("testCalculateExpression success",2.25==result);
    }
}
