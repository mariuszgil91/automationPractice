package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    private final WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
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
        driver.findElement(titleMr).click();
    }

    public void selectTitleMrs(){
        driver.findElement(titleMrs).click();
    }

    public void inputFirstName(String nameFirst){
        driver.findElement(firstName).sendKeys(nameFirst);
    }

    public void inputLastName(String nameLast){
        driver.findElement(lastName).sendKeys(nameLast);
    }

    public void inputPassword(String passwordInput){
        driver.findElement(password).sendKeys(passwordInput);
    }

    public void selectSignUpForNewsletterCheckBox(){
        driver.findElement(signUpForNewsletterCheckBox).click();
    }

    public void selectReceiveSpecialOffersCheckbox(){
        driver.findElement(receiveSpecialOffersCheckbox).click();
    }

    public void inputYourAddressFirstName(String firstNameYourAddress){
        driver.findElement(yourAddressFirstName).sendKeys(firstNameYourAddress);
    }

    public void inputYourAddressLastName(String lastNameYourAddress){
        driver.findElement(yourAddressLastName).sendKeys(lastNameYourAddress);
    }

    public void inputCompany(String companyName){
        driver.findElement(company).sendKeys(companyName);
    }

    public void inputAddress(String addressInput){
        driver.findElement(address).sendKeys(addressInput);
    }

    public void inputAddressLineTwo(String addressTwoInput){
        driver.findElement(addressLineTwo).sendKeys(addressTwoInput);
    }

    public void inputCity(String cityInput){
        driver.findElement(city).sendKeys(cityInput);
    }

    public void inputZipPostCode(String zipPostalCode){
        driver.findElement(zipPostCode).sendKeys(zipPostalCode);
    }

    public void inputAdditionnalInformation(String additionnalInput){
        driver.findElement(additionalInformation).sendKeys(additionnalInput);
    }

    public void inputHomePhone(String homePhoneInput){
        driver.findElement(homePhone).sendKeys(homePhoneInput);
    }

    public void inputMobilePhone(String mobilePhoneInput){
        driver.findElement(mobilePhone).sendKeys(mobilePhoneInput);
    }

    public void inputAddressAlias(String addressAliasInput){
        driver.findElement(addressAlias).sendKeys(addressAliasInput);
    }

    public void clickRegisterButton(){
        driver.findElement(submitButton).click();
    }
}
