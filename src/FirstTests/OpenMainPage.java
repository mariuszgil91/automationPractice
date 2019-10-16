package FirstTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class OpenMainPage {

    WebDriver driver;
    String loginPage = "http://automationpractice.com";
    String expectedTitle = "My Store";


    @BeforeTest
    public void setBaseURL(){
        System.setProperty("webdriver.chrome.driver","/Users/mariuszgil/Developer/automationPractice/chromedriver-2");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void verifyTitleHomePage(){
        driver.get(loginPage);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void endSession(){
        driver.close();
        driver.quit();
    }

}
