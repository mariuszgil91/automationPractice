package Pages;

import BaseClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public By proceedToCheckoutSummary = By.xpath("//*[@class=\"button btn btn-default standard-checkout button-medium\"]");
    public By proceedToCheckoutAddress = By.xpath("//*[@name=\"processAddress\"]");
    public By proceedToCheckoutShipping = By.xpath("//*[@name=\"processCarrier\"]");
    public By agreeTerms = By.id("uniform-cgv");
    public By payByBankWire = By.xpath("//a[@title=\"Pay by bank wire\"]");
    public By confirmOrder = By.xpath("//*[text()=\"I confirm my order\"]");
    public String orderConfirmationPageTitle = "Order confirmation - My Store";

    public CartPage(WebDriver driver) {
        super(driver);
    }

}

