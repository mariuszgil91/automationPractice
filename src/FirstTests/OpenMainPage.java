package FirstTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class OpenMainPage {

    WebDriver driver;
    WebDriverWait myWait;
    String loginPage = "http://automationpractice.com";
    String expectedTitle = "My Store";


    @BeforeTest
    public void setBaseURL(){
        System.setProperty("webdriver.chrome.driver","/Users/mariuszgil/Developer/automationPractice/chromedriver-4");
        driver = new ChromeDriver();
        myWait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void verifyTitleHomePage(){
        driver.get(loginPage);
        String actualTitle = driver.getTitle();
        //myWait.until(ExpectedConditions.visibilityOf(By.id("username")));
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void endSession(){
        driver.close();
        driver.quit();
    }

}
