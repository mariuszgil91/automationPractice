package TestCases;

import BaseClass.BaseTest;
import Pages.*;
import TestData.LogInCredentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyBlouse extends BaseTest {

    @Test
    public void buyBlouse(){
        HomePage homePage = new HomePage(driver);
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        WomenPage womenPage = new WomenPage(driver);
        BlousePage blousePage = new BlousePage(driver);
        LogInCredentials logInCredentials = new LogInCredentials();
        CartPage cartPage = new CartPage(driver);

        homePage.openHomePage();
        homePage.click(homePage.signInButton);
        authenticationPage.signIn(logInCredentials.emailAddress, logInCredentials.password);
        homePage.click(homePage.homePageLogo);
        homePage.click(homePage.womenCategory);
        womenPage.click(womenPage.blouse);
        blousePage.click(blousePage.addToCart);
        blousePage.click(blousePage.proceedToCheckout);
        cartPage.click(cartPage.proceedToCheckoutSummary);
        cartPage.click(cartPage.proceedToCheckoutAddress);
        cartPage.click(cartPage.agreeTerms);
        cartPage.click(cartPage.proceedToCheckoutShipping);
        cartPage.click(cartPage.payByBankWire);
        cartPage.click(cartPage.confirmOrder);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(cartPage.orderConfirmationPageTitle,actualTitle);
    }

}
