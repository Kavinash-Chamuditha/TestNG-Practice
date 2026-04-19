package testNG.parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelMethodTest {

    @Test
    public void openGoogle(){
        System.out.println("Open Google - " + Thread.currentThread().getId());

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.quit();
    }

    @Test
    public void openBing(){
        System.out.println("Open Bing - " + Thread.currentThread().getId());

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bing.com/");
        driver.quit();
    }
}