package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {

    @Test()
    public  void oLevel(){
        System.out.println("O/Level");

    }


    @Test(dependsOnMethods = "oLevel")
    public  void aLevel(){
        System.out.println("A/Level");
    }

    @Test(dependsOnMethods = {"oLevel","aLevel"},alwaysRun = true)
    public  void campus(){
        System.out.println("Campus");
    }
}
