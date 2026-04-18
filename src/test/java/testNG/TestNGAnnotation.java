package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotation {
    public void main(String[] args) {

        System.out.println("This is not a TestNG Test 1");
        TestNGAnnotation testNGAnnotation=new TestNGAnnotation();
        testNGAnnotation.notATestNGMethod();

    }

    public void notATestNGMethod(){
        System.out.println("This is not a TestNG Test 2");
    }

    @Test
    public void test(){
        System.out.println("Test 1");
    }
}
