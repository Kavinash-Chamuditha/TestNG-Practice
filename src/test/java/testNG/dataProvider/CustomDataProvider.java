package testNG.dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider
    public Object[][] getData(){
        Object[][] data={{"oshana@gmail.com","oshana*"},{"chamuditha@gmail.com","chamuditha*"}};
        return data;
    }
}
