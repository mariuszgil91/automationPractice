package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlousePage {
    WebDriver driver;
    WebDriverWait wait;

    public BlousePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    By addToCart = By.id("add_to_cart");
    By proceedToCheckout = By.xpath("//*[@class=\"btn btn-default button button-medium\"]");

    public void pressAddToCart(){
        wait.until(ExpectedConditions.presenceOfElementLocated(addToCart));
        driver.findElement(addToCart).click();
    }

    public void pressProceedToCheckout(){
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout));
        driver.findElement(proceedToCheckout).click();
    }
}
