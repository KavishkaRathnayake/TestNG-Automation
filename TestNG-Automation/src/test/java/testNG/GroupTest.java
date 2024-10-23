package testNG;

import org.testng.annotations.Test;

public class GroupTest {

    //S = Smoke      //R = Regression

    @Test(groups = {"S" , "R"})
    public void Test01(){
        System.out.println("This is Smoke and Regression Test Case");
    }

    @Test(groups = "R")
    public void Test02(){
        System.out.println("This is Regression Test Case");
    }

    @Test
    public void Test03(){
        System.out.println("This is NOT Smoke and Regression Test Case");
    }

    @Test(groups = {"S"})
    public void Test04(){
        System.out.println("This is Smoke Test Case");
    }

    @Test(groups = {"S" , "R"})
    public void Test05(){
        System.out.println("This is Smoke and Regression Test Case");
    }


}
