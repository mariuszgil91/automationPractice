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

    By addToCart = By.xpath("//button[@name=\"Submit\"]");
    By proceedToCheckout = By.xpath("//a[@title=\"Proceed to checkout\"]");

    public void pressAddtoCart(){
        wait.until(ExpectedConditions.presenceOfElementLocated(addToCart));
        driver.findElement(addToCart).click();
    }

    public void pressProceedToCheckout(){
        wait.until(ExpectedConditions.presenceOfElementLocated(proceedToCheckout));
        driver.findElement(proceedToCheckout).click();
    }
}
