package TestCases;

import Pages.AuthenticationPage;
import Pages.HomePage;
import Pages.MyAccount;
import TestData.LogInCredentials;
import WebDriverProperty.ChromeDriverProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn {

    WebDriver driver;
    HomePage homePage;
    LogInCredentials logInCredentials;
    AuthenticationPage authenticationPage;
    ChromeDriverProperty chromeDriverProperty;
    MyAccount myAccount;


    @BeforeTest
    public void openHomePage(){
        chromeDriverProperty = new ChromeDriverProperty();
        System.setProperty(chromeDriverProperty.chromeDriver, chromeDriverProperty.chromeDriverPath);
        driver = new ChromeDriver();
        logInCredentials = new LogInCredentials();
        myAccount = new MyAccount();
        authenticationPage = new AuthenticationPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void signInApplication(){
        authenticationPage.signIn(logInCredentials.emailAddress, logInCredentials.password);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(myAccount.myAccountPageTitle,actualTitle);
    }

    @AfterTest
    public void endSession(){
        driver.close();
        driver.quit();
    }

}
