package TestCases;

import BaseClass.BaseTest;
import Pages.HomePage;
import org.testng.annotations.Test;

public class VerifyHomePageTitle extends BaseTest {

    @Test
    public void verifyIfYouAreOnTheHomePage(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.checkIfYouAreOnTheHomePage();
    }
}
