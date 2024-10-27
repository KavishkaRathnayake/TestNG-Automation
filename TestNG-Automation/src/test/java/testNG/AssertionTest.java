package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
    String actualValue = "Kavishka";

    @Test(priority = 0)
    public void valuesEqualCheck(){
        String expectedValue = "Kavishka";
        System.out.println("Prior to valuesEqualCheck Assertion");
        Assert.assertEquals(actualValue,expectedValue,"Values miss matched");
        System.out.println("After to valuesEqualCheck Assertion");
    }

    @Test(priority = 1)
    public void valuesNotEqualCheck(){
        String expectedValue = "Medhanga";
        System.out.println("Prior to valuesNotEqualCheck Assertion");
        Assert.assertNotEquals(actualValue,expectedValue,"Values matched");
        System.out.println("After to valuesNotEqualCheck Assertion");
    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck Assertion");
        Assert.assertTrue(actualValue.startsWith("K"),"Condition Returns a false");
        System.out.println("After to trueConditionCheck Assertion");
    }
    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck Assertion");
        Assert.assertFalse(actualValue.isBlank(),"Condition Returns a true");
        System.out.println("After to falseConditionCheck Assertion");
    }

}
