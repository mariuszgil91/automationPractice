package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    By signInButton = By.className("login");
    String homePageURL = "http://automationpractice.com/index.php";
    String homePageTitle = "My Store";

    public void pressSignInButton(){
        driver.findElement(signInButton).click();
    }

    public void openHomePage(){
        driver.get(homePageURL);
    }

    public void checkIfYouAreOnTheHomePage(){
        String currentTitle = driver.getTitle();
        Assert.assertEquals(currentTitle, homePageTitle);
    }

}
