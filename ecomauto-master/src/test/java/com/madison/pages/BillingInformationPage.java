package com.madison.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

/**
 * Created by razvansidra on 7/26/2017.
 */
public class BillingInformationPage extends PageObject {

    @FindBy(css = "[id=\"billing:firstname\"]")
    private WebElement firstNameInput;

    @FindBy(css = "[id=\"billing:lastname\"]")
    private WebElement lastNameInput;

    @FindBy(css = "[id=\"billing:email\"]")
    private WebElement emailInput;

    @FindBy(css = "[id=\"billing:street1\"]")
    private WebElement addressInput;

    @FindBy(css = "[id=\"billing:city\"]")
    private WebElement cityInput;

    @FindBy(css = "[id=\"billing:postcode\"]")
    private WebElement postalCodeInput;

    @FindBy(css = "[id=\"billing:country_id\"]")
    private WebElement countrySelect;

    @FindBy(css = "[id=\"billing:telephone\"]")
    private WebElement telephoneInput;

    @FindBy(css = "div[id='billing-buttons-container'] button>span>span")
    private WebElement continueBillingInformationButton;

    @FindBy(css = "#billing-address-select")
    private WebElement addressDropdown;

    @FindBy(css = "#advice-validate-email-billing:email")
            private WebElement checkEmail;

    TestData data;

    public void selectAddress(String word) {
        addressDropdown.sendKeys(word);
    }

    public void inputFirstName() {
        //waitFor(firstName);
        firstNameInput.sendKeys(data.getFirstName());
    }

    public void inputLastName(String word) {
        lastNameInput.sendKeys(word);
    }

    public void inputEmailAddress(String word) {
        emailInput.sendKeys(word);
    }

    public void inputAddress(String word) {
        addressInput.sendKeys(word);
    }

    public void inputCity(String word) {
        cityInput.sendKeys(word);
    }

    public void inputPostalCode(String word) {
        postalCodeInput.sendKeys(word);
    }

    public void selectCountry(String word) {
        countrySelect.sendKeys(word);
    }

    public void inputTelephone(String word) {
        telephoneInput.sendKeys(word);
    }

    public void clickOnContinue() {continueBillingInformationButton.click();}



    public String checkEmail(){

        String message = checkEmail.getText();
        return message;
    }
}