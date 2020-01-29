package Pages;

import BaseClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage{

    public By signInButton = By.className("login");
    public By womenCategory = By.xpath("//a[@title=\"Women\"]");
    public By homePageLogo = By.id("header_logo");
    String homePageURL = "http://automationpractice.com/index.php";
    String homePageTitle = "My Store";

    public HomePage (WebDriver driver) {
        super(driver);
    }

    public void openHomePage(){
        driver.get(homePageURL);
    }

    public void checkIfYouAreOnTheHomePage(){
        String currentTitle = driver.getTitle();
        Assert.assertEquals(currentTitle, homePageTitle);
    }
}
