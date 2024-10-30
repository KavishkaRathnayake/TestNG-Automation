package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;



public class ArithmeticOperatorTest_HardAssert {

    @Test(priority = 0)
    public void testSum(){
        System.out.println("**********First Test Case for calSum**********");

        System.out.println("<<<<<<<<<<First Sum Calculation>>>>>>>>>>");
        int actualValueSum1 = ArithmeticOperator.CalSum(10 , 30);
        System.out.println("Actual sum 1 Value is: " + actualValueSum1);
        Assert.assertEquals(actualValueSum1,40,"Could not calculate Sum01");


        System.out.println("<<<<<<<<<<Second Sum Calculation>>>>>>>>>>");
        int actualValueSum2 = ArithmeticOperator.CalSum(7 , 3);
        System.out.println("Actual sum 2 Value is: " + actualValueSum2);
        Assert.assertEquals(actualValueSum2,10,"Could not calculate Sum02");

        System.out.println("<<<<<<<<<<Third Sum Calculation>>>>>>>>>>");
        int actualValueSum3 = ArithmeticOperator.CalSum(12 , 13);
        System.out.println("Actual sum 3 Value is: " + actualValueSum3);
        Assert.assertEquals(actualValueSum3,25,"Could not calculate Sum03");
    }


    @Test(priority = 1)
    public void testSubstraction(){
        System.out.println("**********First Test Case for calSum**********");

        System.out.println("<<<<<<<<<<First Substraction Calculation>>>>>>>>>>");
        int actualValueSubstraction1 = ArithmeticOperator.CalSubstraction(70 , 30);
        System.out.println("Actual Substraction 1 Value is: " + actualValueSubstraction1);
        Assert.assertEquals(actualValueSubstraction1,40,"Could not calculate Substraction1");


        System.out.println("<<<<<<<<<<Second Substraction Calculation>>>>>>>>>>");
        int actualValueSubstraction12 = ArithmeticOperator.CalSubstraction(7 , 3);
        System.out.println("Actual Substraction 2 Value is: " + actualValueSubstraction12);
        Assert.assertEquals(actualValueSubstraction12,4,"Could not calculate Substraction2");

        System.out.println("<<<<<<<<<<Third Substraction Calculation>>>>>>>>>>");
        int actualValueSubstraction3 = ArithmeticOperator.CalSubstraction(25 , 13);
        System.out.println("Actual Substraction 3 Value is: " + actualValueSubstraction3);
        Assert.assertEquals(actualValueSubstraction3,12,"Could not calculate Substraction3");

    }
}
