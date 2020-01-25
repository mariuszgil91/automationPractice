package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

    private final WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    By signInButton = By.className("login");
    By womenCategory = By.xpath("//*[@title=\"Women\"]");
    String homePageURL = "http://automationpractice.com/index.php";
    String homePageTitle = "My Store";

    public void pressSignInButton(){
        driver.findElement(signInButton).click();
    }

    public void openWomenCategory(){
        wait.until(ExpectedConditions.presenceOfElementLocated(womenCategory));
        driver.findElement(womenCategory).click();
    }

    public void openHomePage(){
        driver.get(homePageURL);
    }

    public void checkIfYouAreOnTheHomePage(){
        String currentTitle = driver.getTitle();
        Assert.assertEquals(currentTitle, homePageTitle);
    }
}
