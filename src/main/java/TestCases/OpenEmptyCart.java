package TestCases;

import BaseClass.BaseTest;
import Pages.CartPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenEmptyCart extends BaseTest {

    @Test
    public void openEmptyCart(){
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        homePage.openHomePage();
        homePage.click(homePage.cartButton);
        Assert.assertEquals(getDriver().getTitle(), cartPage.cartPageTitle);
    }

}
