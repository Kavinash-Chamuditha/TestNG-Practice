package testNG;

import org.testng.annotations.*;


public class AnnotationHierarchy {

    @Test
    public void test1() {
        System.out.println("Im Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Im Test 2");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Im Before Method");

    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("Im After Method");


    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Im Before Class");

    }

    @AfterClass
    public void afterClass() {
        System.out.println("Im After Class");

    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Im Before Test");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("Im After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Im Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Im After Suite");
    }

}
