package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenPage {
    WebDriver driver;
    WebDriverWait wait;
    public WomenPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    By blouse = By.xpath("//*[@title=\"Blouse\"]");

    public void clickBlouse(){
        wait.until(ExpectedConditions.presenceOfElementLocated(blouse));
        driver.findElement(blouse).click();
    }
}
