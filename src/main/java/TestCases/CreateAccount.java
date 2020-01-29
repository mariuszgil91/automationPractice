package TestCases;

import BaseClass.BaseTest;
import Pages.AuthenticationPage;
import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.MyAccount;
import TestData.CreateAccountCredentials;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreateAccount extends BaseTest {

    @Test
    public void createAccount(){

        HomePage homePage = new HomePage(driver);
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        CreateAccountCredentials createAccountCredentials = new CreateAccountCredentials();
        MyAccount myAccount = new MyAccount();

        homePage.openHomePage();
        homePage.click(homePage.signInButton);
        authenticationPage.createAccount(createAccountCredentials.emailAddress);
        createAccountPage.click(createAccountPage.titleMr);
        createAccountPage.writeText(createAccountPage.firstName, createAccountCredentials.firstName);
        createAccountPage.writeText(createAccountPage.lastName, createAccountCredentials.lastName);
        createAccountPage.writeText(createAccountPage.email, createAccountCredentials.emailAddress);
        createAccountPage.writeText(createAccountPage.password, createAccountCredentials.password);
        createAccountPage.selectFromDropDownList(createAccountPage.days);
        createAccountPage.selectFromDropDownList(createAccountPage.months);
        createAccountPage.selectFromDropDownList(createAccountPage.years);
        createAccountPage.writeText(createAccountPage.yourAddressFirstName, createAccountCredentials.firstName);
        createAccountPage.writeText(createAccountPage.yourAddressLastName, createAccountCredentials.lastName);
        createAccountPage.writeText(createAccountPage.company, createAccountCredentials.companyName);
        createAccountPage.writeText(createAccountPage.address, createAccountCredentials.address);
        createAccountPage.writeText(createAccountPage.city, createAccountCredentials.city);
        createAccountPage.selectFromDropDownList(createAccountPage.state);
        createAccountPage.writeText(createAccountPage.zipPostCode, createAccountCredentials.zipCode);
        createAccountPage.writeText(createAccountPage.additionalInformation, createAccountCredentials.additionalInformation);
        createAccountPage.writeText(createAccountPage.homePhone, createAccountCredentials.homePhone);
        createAccountPage.writeText(createAccountPage.mobilePhone, createAccountCredentials.mobilePhone);
        createAccountPage.writeText(createAccountPage.addressAlias, createAccountCredentials.addressAlias);
        createAccountPage.click(createAccountPage.submitButton);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(myAccount.myAccountPageTitle,actualTitle);
    }
}
