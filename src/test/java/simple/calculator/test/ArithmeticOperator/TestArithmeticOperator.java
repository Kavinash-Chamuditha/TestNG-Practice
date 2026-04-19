package simple.calculator.test.ArithmeticOperator;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import simple.calculator.ArithmeticOperator;

public class TestArithmeticOperator {

    @Test(priority = 0)
    public void testSum1() {

        SoftAssert softAssert = new SoftAssert();

        int actual = ArithmeticOperator.calSum(20, 5);
        System.out.println("Actual Sum value is: " + actual);
        softAssert.assertEquals(actual, 21, "Failed to calculate sum");

        int actual1 = ArithmeticOperator.calSum(10, 20);
        System.out.println("Actual Sum value is: " + actual1);
        softAssert.assertEquals(actual1, 30, "Failed to calculate sum");

        int actual2 = ArithmeticOperator.calSum(4, 8);
        System.out.println("Actual Sum value is: " + actual2);
        softAssert.assertEquals(actual2, 12, "Failed to calculate sum");

        softAssert.assertAll();

    }
}