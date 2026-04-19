package testNG;

import com.sun.jdi.Value;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

    SoftAssert softAssert=new SoftAssert();
    String actualValue = "Kavinash";



    @Test(priority = 0)
    public void valuesEqualCheck(){
//        if(name.equals("Kavinash")){
//            System.out.println("Name is equal");
//        }
//        else{
//            System.out.println("Name is not equal");
//        }

        String expectedValue ="Kavinash123";
        System.out.println("Prior to valuesEqualCheck assertion");
        softAssert.assertEquals(actualValue,expectedValue,"Value ,miss match");
        System.out.println("After valueEqualCheck assertion");
        softAssert.assertAll();
    }



    @Test(priority = 1)
    public void valuesNotEqualCheck(){

        String expectedValue ="Kavinash";
        System.out.println("Prior to valuesnotEqualCheck assertion");
        softAssert.assertEquals(actualValue,expectedValue,"Value ,match");
        System.out.println("After valuenotEqualCheck assertion");

    }


    @Test(priority = 2)
    public void trueConditonCheck(){

        String expectedValue ="Kavinash";
        System.out.println("Prior to true condition check assertion");
        softAssert.assertEquals(actualValue.startsWith("K"),"Condition return a false");
        System.out.println("After trueconditionchecck assertion");
    }

    @Test(priority = 3)
    public void falseConditonCheck(){

        String expectedValue ="Kavinash";
        System.out.println("Prior to false condition check assertion");
        softAssert.assertEquals(actualValue.isBlank(),"Condition return a true");
        System.out.println("After falseconditionchecck assertion");
    }
}
