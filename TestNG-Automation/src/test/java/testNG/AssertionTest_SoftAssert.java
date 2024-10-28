package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest_SoftAssert {
    SoftAssert softAssert = new SoftAssert();
    String actualValue = "Kavishka";

    @Test(priority = 0)
    public void valuesEqualCheck(){
        String expectedValue = "Kavishka123";
        System.out.println("Prior to valuesEqualCheck Assertion");
        softAssert.assertEquals(actualValue,expectedValue,"Values miss matched");
        System.out.println("After to valuesEqualCheck Assertion");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void valuesNotEqualCheck(){
        String expectedValue = "Medhanga";
        System.out.println("Prior to valuesNotEqualCheck Assertion");
        softAssert.assertNotEquals(actualValue,expectedValue,"Values matched");
        System.out.println("After to valuesNotEqualCheck Assertion");

    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck Assertion");
        softAssert.assertTrue(actualValue.startsWith("K"),"Condition Returns a false");
        System.out.println("After to trueConditionCheck Assertion");

    }
    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck Assertion");
        softAssert.assertFalse(actualValue.isBlank(),"Condition Returns a true");
        System.out.println("After to falseConditionCheck Assertion");

    }
}
