package TestCases;

import BaseClass.BaseTest;
import Pages.*;
import TestData.LogInCredentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyBlouse extends BaseTest {

    @Test
    public void buyBlouse(){
        HomePage homePage = new HomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        BlousePage blousePage = new BlousePage(getDriver());
        LogInCredentials logInCredentials = new LogInCredentials();
        CartPage cartPage = new CartPage(getDriver());

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
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals(cartPage.orderConfirmationPageTitle,actualTitle);
    }

}
