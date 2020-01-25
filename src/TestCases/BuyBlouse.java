package TestCases;

import Pages.*;
import TestData.CreateAccountCredentials;
import TestData.LogInCredentials;
import WebDriverProperty.ChromeDriverProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuyBlouse {

    WebDriver driver;
    ChromeDriverProperty chromeDriverProperty;
    HomePage homePage;
    AuthenticationPage authenticationPage;
    CreateAccountPage createAccountPage;
    LogInCredentials logInCredentials;
    MyAccount myAccount;
    WomenPage womenPage;
    BlousePage blousePage;
    CartPage cartPage;

    @BeforeTest
    public void openHomePage(){
        chromeDriverProperty = new ChromeDriverProperty();
        System.setProperty(chromeDriverProperty.chromeDriver, chromeDriverProperty.chromeDriverPath);
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        authenticationPage = new AuthenticationPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        womenPage = new WomenPage(driver);
        blousePage = new BlousePage(driver);
        cartPage = new CartPage(driver);
        logInCredentials = new LogInCredentials();
        myAccount = new MyAccount();
        homePage.openHomePage();
        driver.manage().window().fullscreen();
    }

    @AfterTest
    public void endSession(){
        driver.close();
        driver.quit();
    }

    @Test
    public void buyBlouse(){
        homePage.pressSignInButton();
        authenticationPage.signIn(logInCredentials.emailAddress, logInCredentials.password);
        homePage.openHomePage();
        homePage.openWomenCategory();
        womenPage.clickBlouse();
        blousePage.pressAddToCart();
        blousePage.pressProceedToCheckout();
        cartPage.pressProceedToCheckoutSummary();
        cartPage.pressProceedToCheckoutAddress();
        cartPage.selectAgreeTerms();
        cartPage.pressProceedToCheckoutShipping();
        cartPage.pressPayByBankWire();
        cartPage.pressConfirmOrder();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(cartPage.orderConfirmationPageTitle,actualTitle);
    }



}
