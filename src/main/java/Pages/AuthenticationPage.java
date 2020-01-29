package Pages;

import BaseClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage {

    //Create account
    By createAccountEmail = By.id("email_create");
    By submitCreateAccountButton = By.id("SubmitCreate");

    //Sign in
    By signInEmail = By.id("email");
    By signInPassword = By.id("passwd");
    By signInButton = By.id("SubmitLogin");

    public String authenticationURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public void createAccount(String email){
        writeText(createAccountEmail, email);
        click(submitCreateAccountButton);
    }

    public void signIn(String email, String password){
        driver.get(authenticationURL);
        writeText(signInEmail, email);
        writeText(signInPassword, password);
        click(signInButton);
    }

}
