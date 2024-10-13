package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnTest {
    @Test
    public void OLevel(){
        System.out.println("O/L");
        Assert.fail();
    }

    @Test (dependsOnMethods = "OLevel")
    public void Alevel(){
        System.out.println("A/L");
    }

    @Test(dependsOnMethods = {"OLevel" , "Alevel" }, alwaysRun = true)
    public void Campus(){
        System.out.println("Campus");
    }
}
