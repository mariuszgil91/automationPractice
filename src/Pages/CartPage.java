package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    By proceedToCheckoutSummary = By.xpath("//a[@title=\"Proceed to checkout\"]");
    By proceedToCheckoutAddress = By.xpath("//*[@name=\"processAddress\"]");
    By proceedToCheckoutShipping = By.xpath("//*[@name=\"processCarrier\"]");
    By agreeTerms = By.id("cgv");
    By payByBankWire = By.xpath("//a[@title=\"Pay by bank wire\"]");
    By confirmOrder = By.xpath("//*[text()=\"I confirm my order\"]");
    public String orderConfirmationPageTitle = "Order confirmation - My Store";

    public void pressProceedToCheckoutSummary(){
        wait.until(ExpectedConditions.presenceOfElementLocated(proceedToCheckoutSummary));
        driver.findElement(proceedToCheckoutSummary).click();
    }

    public void pressProceedToCheckoutAddress(){
        wait.until(ExpectedConditions.presenceOfElementLocated(proceedToCheckoutAddress));
        driver.findElement(proceedToCheckoutAddress).click();
    }

    public void pressProceedToCheckoutShipping(){
        wait.until(ExpectedConditions.presenceOfElementLocated(proceedToCheckoutShipping));
        driver.findElement(proceedToCheckoutShipping).click();
    }

    public void selectAgreeTerms(){
        wait.until(ExpectedConditions.presenceOfElementLocated(agreeTerms));
        driver.findElement(agreeTerms).click();
    }

    public void pressPayByBankWire(){
        wait.until(ExpectedConditions.presenceOfElementLocated(payByBankWire));
        driver.findElement(payByBankWire).click();
    }

    public void pressConfirmOrder(){
        wait.until(ExpectedConditions.presenceOfElementLocated(confirmOrder));
        driver.findElement(confirmOrder).click();
    }



}

