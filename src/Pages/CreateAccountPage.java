package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {

    private final WebDriver driver;
    WebDriverWait wait;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    By titleMr = By.id("id_gender1");
    By titleMrs = By.id("id_gender2");
    By firstName = By.id("customer_firstname");
    By lastName = By.id("customer_lastname");
    By email = By.id("email");
    By password = By.id("passwd");
    By days = By.id("days");
    By months = By.id("months");
    By years = By.id("years");
    By signUpForNewsletterCheckBox = By.id("newsletter");
    By receiveSpecialOffersCheckbox = By.id("optin");
    By yourAddressFirstName = By.id("firstname");
    By yourAddressLastName = By.id("lastname");
    By company = By.id("company");
    By address = By.id("address1");
    By addressLineTwo = By.id("address2");
    By city = By.id("city");
    By state = By.id("id_state");
    By zipPostCode = By.id("postcode");
    By country = By.id("id_country");
    By additionalInformation = By.id("other");
    By homePhone = By.id("phone");
    By mobilePhone = By.id("phone_mobile");
    By addressAlias = By.id("alias");
    By submitButton = By.id("submitAccount");


    public void selectTitleMr(){
        wait.until(ExpectedConditions.presenceOfElementLocated(titleMr));
        driver.findElement(titleMr).click();
    }

    public void selectTitleMrs(){
        wait.until(ExpectedConditions.presenceOfElementLocated(titleMrs));
        driver.findElement(titleMrs).click();
    }

    public void inputFirstName(String nameFirst){
        wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
        driver.findElement(firstName).sendKeys(nameFirst);
    }

    public void inputLastName(String nameLast){
        wait.until(ExpectedConditions.presenceOfElementLocated(lastName));
        driver.findElement(lastName).sendKeys(nameLast);
    }

    public void clearAndInputEmail(String emailAddress){
        wait.until(ExpectedConditions.presenceOfElementLocated(email));
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(emailAddress);
    }

    public void inputPassword(String passwordInput){
        wait.until(ExpectedConditions.presenceOfElementLocated(password));
        driver.findElement(password).sendKeys(passwordInput);
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

    public void selectSignUpForNewsletterCheckBox(){
        wait.until(ExpectedConditions.presenceOfElementLocated(signUpForNewsletterCheckBox));
        driver.findElement(signUpForNewsletterCheckBox).click();
    }

    public void selectReceiveSpecialOffersCheckbox(){
        wait.until(ExpectedConditions.presenceOfElementLocated(receiveSpecialOffersCheckbox));
        driver.findElement(receiveSpecialOffersCheckbox).click();
    }

    public void inputYourAddressFirstName(String firstNameYourAddress){
        wait.until(ExpectedConditions.presenceOfElementLocated(yourAddressFirstName));
        driver.findElement(yourAddressFirstName).sendKeys(firstNameYourAddress);
    }

    public void inputYourAddressLastName(String lastNameYourAddress){
        wait.until(ExpectedConditions.presenceOfElementLocated(yourAddressFirstName));
        driver.findElement(yourAddressLastName).sendKeys(lastNameYourAddress);
    }

    public void inputCompany(String companyName){
        wait.until(ExpectedConditions.presenceOfElementLocated(company));
        driver.findElement(company).sendKeys(companyName);
    }

    public void inputAddress(String addressInput){
        wait.until(ExpectedConditions.presenceOfElementLocated(address));
        driver.findElement(address).sendKeys(addressInput);
    }

    public void inputAddressLineTwo(String addressTwoInput){
        wait.until(ExpectedConditions.presenceOfElementLocated(addressLineTwo));
        driver.findElement(addressLineTwo).sendKeys(addressTwoInput);
    }

    public void inputCity(String cityInput){
        wait.until(ExpectedConditions.presenceOfElementLocated(city));
        driver.findElement(city).sendKeys(cityInput);
    }

    public void selectAlabamaState(){
        wait.until(ExpectedConditions.presenceOfElementLocated(state));
        Select getAlabama = new Select(driver.findElement(state));
        getAlabama.selectByVisibleText("Alabama");
    }

    public void inputZipPostCode(String zipPostalCode){
        wait.until(ExpectedConditions.presenceOfElementLocated(zipPostCode));
        driver.findElement(zipPostCode).sendKeys(zipPostalCode);
    }

    public void selectCountryUnitedStates(){
        wait.until(ExpectedConditions.presenceOfElementLocated(country));
        Select selectUSA = new Select(driver.findElement(country));
        selectUSA.selectByVisibleText("United States");
    }

    public void inputAdditionalInformation(String additionalInput){
        wait.until(ExpectedConditions.presenceOfElementLocated(additionalInformation));
        driver.findElement(additionalInformation).sendKeys(additionalInput);
    }

    public void inputHomePhone(String homePhoneInput){
        wait.until(ExpectedConditions.presenceOfElementLocated(homePhone));
        driver.findElement(homePhone).sendKeys(homePhoneInput);
    }

    public void inputMobilePhone(String mobilePhoneInput){
        wait.until(ExpectedConditions.presenceOfElementLocated(mobilePhone));
        driver.findElement(mobilePhone).sendKeys(mobilePhoneInput);
    }

    public void inputAddressAlias(String addressAliasInput){
        wait.until(ExpectedConditions.presenceOfElementLocated(addressAlias));
        driver.findElement(addressAlias).sendKeys(addressAliasInput);
    }

    public void clickRegisterButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
        driver.findElement(submitButton).click();
    }
}
