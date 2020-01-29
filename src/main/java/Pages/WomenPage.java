package Pages;

import BaseClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenPage extends BasePage {

    public By blouse = By.xpath("//a[@title='Blouse' and @class='product-name']");

    public WomenPage(WebDriver driver) {
       super(driver);
    }
}
