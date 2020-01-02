package TestCases;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn {

    WebDriver driver;
    HomePage homePage;


    @BeforeTest
    public void openHomePage(){
        System.setProperty("webdriver.chrome.driver","/Users/mariuszgil/Developer/automationPractice/chromedriver-4");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.openHomePage();
    }

    @Test
    public void verifyIfYouAreOnTheHomePage(){
        homePage.checkIfYouAreOnTheHomePage();
    }


    @AfterTest
    public void endSession(){
        driver.close();
        driver.quit();
    }

}
