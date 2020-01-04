package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {

    private final WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    //Create account
    By createAccountEmail = By.id("email_create");
    By submitCreateAccountButton = By.name("SubmitCreate");

    //Sign in
    By signInEmail = By.id("text");
    By signInPassword = By.id("passwd");
    By signInButton = By.id("SubmitLogin");


    public void createAccount(String email){
        driver.findElement(createAccountEmail).sendKeys(email);
        driver.findElement(submitCreateAccountButton).click();
    }


    public void signIn(String email, String password){
        driver.findElement(signInEmail).sendKeys(email);
        driver.findElement(signInPassword).sendKeys(password);
        driver.findElement(signInButton).click();
    }



}
