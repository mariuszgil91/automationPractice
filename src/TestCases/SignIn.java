package TestCases;

import Pages.HomePage;
import WebDriverProperty.ChromeDriverProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn {

    WebDriver driver;
    HomePage homePage;
    ChromeDriverProperty chromeDriverProperty;


    @BeforeTest
    public void openHomePage(){
        chromeDriverProperty = new ChromeDriverProperty();
        System.setProperty(chromeDriverProperty.chromeDriver, chromeDriverProperty.chromeDriverPath);
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.openHomePage();
    }

    @Test
    public void pressSignInButton(){
        homePage.pressSignInButton();
    }

    @AfterTest
    public void endSession(){
        driver.close();
        driver.quit();
    }

}
