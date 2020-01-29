package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "/Users/mariuszgil/Developer/automationPractice/chromedriver-4");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
