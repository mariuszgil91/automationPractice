package FirstTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFor(String query) {
        driver.findElement(By.cssSelector("input[name='q']"))
                .sendKeys(query);
        driver.findElement(By.cssSelector("input[type='submit']"))
                .click();
    }
}
