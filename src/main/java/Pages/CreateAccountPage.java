package Pages;

import BaseClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {

    public By titleMr = By.id("id_gender1");
    public By titleMrs = By.id("id_gender2");
    public By firstName = By.id("customer_firstname");
    public By lastName = By.id("customer_lastname");
    public By email = By.id("email");
    public By password = By.id("passwd");
    public By days = By.id("days");
    public By months = By.id("months");
    public By years = By.id("years");
    public By signUpForNewsletterCheckBox = By.id("newsletter");
    public By receiveSpecialOffersCheckbox = By.id("optin");
    public By yourAddressFirstName = By.id("firstname");
    public By yourAddressLastName = By.id("lastname");
    public By company = By.id("company");
    public By address = By.id("address1");
    public By addressLineTwo = By.id("address2");
    public By city = By.id("city");
    public By state = By.id("id_state");
    public By zipPostCode = By.id("postcode");
    public By country = By.id("id_country");
    public By additionalInformation = By.id("other");
    public By homePhone = By.id("phone");
    public By mobilePhone = By.id("phone_mobile");
    public By addressAlias = By.id("alias");
    public By submitButton = By.id("submitAccount");


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstDay(){
        wait.until(ExpectedConditions.presenceOfElementLocated(days));
        Select firstDay = new Select(driver.findElement(days));
        firstDay.selectByValue("1");
    }

    public void selectFirstMonth(){
        wait.until(ExpectedConditions.presenceOfElementLocated(months));
        Select firstMonth = new Select(driver.findElement(months));
        firstMonth.selectByValue("1");
    }

    public void selectYear2010(){
        wait.until(ExpectedConditions.presenceOfElementLocated(years));
        Select getYear2010 = new Select(driver.findElement(years));
        getYear2010.selectByValue("2010");
    }

    public void selectAlabamaState(){
        wait.until(ExpectedConditions.presenceOfElementLocated(state));
        Select getAlabama = new Select(driver.findElement(state));
        getAlabama.selectByVisibleText("Alabama");
    }

    public void selectCountryUnitedStates(){
        wait.until(ExpectedConditions.presenceOfElementLocated(country));
        Select selectUSA = new Select(driver.findElement(country));
        selectUSA.selectByVisibleText("United States");
    }

}
