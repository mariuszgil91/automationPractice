package TestCases;

import Credentials.createAccountCredentials;
import Pages.AuthenticationPage;
import Pages.CreateAccountPage;
import Pages.HomePage;
import WebDriverProperty.ChromeDriverProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAccount {

    WebDriver driver;
    ChromeDriverProperty chromeDriverProperty;
    HomePage homePage;
    AuthenticationPage authenticationPage;
    CreateAccountPage createAccountPage;
    createAccountCredentials createAccountCredentials;


    @BeforeTest
    public void openHomePage(){
        chromeDriverProperty = new ChromeDriverProperty();
        System.setProperty(chromeDriverProperty.chromeDriver, chromeDriverProperty.chromeDriverPath);
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        authenticationPage = new AuthenticationPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        createAccountCredentials = new createAccountCredentials();
        homePage.openHomePage();
    }

    @AfterTest
    public void endSession(){
        driver.close();
        driver.quit();
    }

    @Test
    public void createAccount(){
        homePage.pressSignInButton();
        authenticationPage.createAccount(createAccountCredentials.emailAddress);
        createAccountPage.selectTitleMr();
        createAccountPage.inputFirstName(createAccountCredentials.firstName);
        createAccountPage.inputLastName(createAccountCredentials.lastName);
        createAccountPage.clearAndInputEmail(createAccountCredentials.emailAddress);
        createAccountPage.inputPassword(createAccountCredentials.password);
        createAccountPage.selectFirstDay();
        createAccountPage.selectFirstMonth();
        createAccountPage.selectYear2010();
        createAccountPage.inputYourAddressFirstName(createAccountCredentials.firstName);
        createAccountPage.inputYourAddressLastName(createAccountCredentials.lastName);
        createAccountPage.inputCompany(createAccountCredentials.companyName);
        createAccountPage.inputAddress(createAccountCredentials.address);
        createAccountPage.inputCity(createAccountCredentials.city);
        createAccountPage.selectAlabamaState();
        createAccountPage.inputZipPostCode(createAccountCredentials.zipCode);
        createAccountPage.inputAdditionalInformation(createAccountCredentials.additionalInformation);
        createAccountPage.inputHomePhone(createAccountCredentials.homePhone);
        createAccountPage.inputMobilePhone(createAccountCredentials.mobilePhone);
        createAccountPage.inputAddressAlias(createAccountCredentials.addressAlias);
        createAccountPage.clickRegisterButton();
    }


}
