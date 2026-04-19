package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {

    @Test
    @Parameters({"val1","val2"})
    public void Sum(int v1,int v2){
        int sum=v1+v2;
        System.out.println("Sum is " +sum);
    }
}
