package Pages;

import BaseClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlousePage extends BasePage {

    public By addToCart = By.id("add_to_cart");
    public By proceedToCheckout = By.xpath("//*[@class=\"btn btn-default button button-medium\"]");

    public BlousePage(WebDriver driver){
        super(driver);
    }
}
