package TestCases;

import BaseClass.BaseTest;
import Pages.CartPage;
import Pages.ContactUs;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenContactUsPage extends BaseTest {

    @Test
    public void openContactUsPage(){
        HomePage homePage = new HomePage(getDriver());
        ContactUs contactUs = new ContactUs(getDriver());
        homePage.openHomePage();
        homePage.click(homePage.contactUsButton);
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals(actualTitle, contactUs.contactUsPageTitle);
    }

}
