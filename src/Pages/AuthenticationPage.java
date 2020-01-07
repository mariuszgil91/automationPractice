package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage {

    private final WebDriver driver;
    WebDriverWait wait;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    //Create account
    By createAccountEmail = By.id("email_create");
    By submitCreateAccountButton = By.id("SubmitCreate");

    //Sign in
    By signInEmail = By.id("text");
    By signInPassword = By.id("passwd");
    By signInButton = By.id("SubmitLogin");


    public void createAccount(String email){
        wait.until(ExpectedConditions.presenceOfElementLocated(createAccountEmail));
        driver.findElement(createAccountEmail).sendKeys(email);
        wait.until(ExpectedConditions.presenceOfElementLocated(submitCreateAccountButton));
        driver.findElement(submitCreateAccountButton).click();
    }


    public void signIn(String email, String password){
        wait.until(ExpectedConditions.presenceOfElementLocated(signInButton));
        driver.findElement(signInEmail).sendKeys(email);
        wait.until(ExpectedConditions.presenceOfElementLocated(signInPassword));
        driver.findElement(signInPassword).sendKeys(password);
        wait.until(ExpectedConditions.presenceOfElementLocated(signInButton));
        driver.findElement(signInButton).click();
    }



}
