package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {

    @Test
    @Parameters({"val1","val2"})
    public void Sum(int v1,int v2){
        int Diffrent=v1-v2;
        System.out.println("Different is " +Diffrent);
    }
}
