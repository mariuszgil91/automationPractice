package TestCases;

import BaseClass.BaseTest;
import Pages.AuthenticationPage;
import Pages.MyAccount;
import TestData.LogInCredentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends BaseTest {

    @Test
    public void signInApplication(){
        AuthenticationPage authenticationPage= new AuthenticationPage(driver);
        LogInCredentials logInCredentials = new LogInCredentials();
        MyAccount myAccount = new MyAccount();

        authenticationPage.signIn(logInCredentials.emailAddress, logInCredentials.password);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(myAccount.myAccountPageTitle,actualTitle);
    }

}
