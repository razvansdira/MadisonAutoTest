package com.madison.tests;

import com.madison.pages.SetTestData;
import com.madison.pages.TestData;
import com.madison.steps.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by razvansidra on 7/27/2017.
 */

@RunWith(SerenityRunner.class)
public class test03CheckoutLoginNewAddressTest {

    @Before
    public void maxiPage(){driver.manage().window().maximize();}

    @Managed(uniqueSession = true)
    public WebDriver driver;


    String username = "test@gmail.com";
    String password = "test11";

    String selectAddress = "New Address";


    @Steps
    public CheckoutSteps checkoutSteps;

    private SetTestData init = new SetTestData();


    @Test
    public void checkoutLoginNewAddress(){
        TestData testData =  init.initTestData();

        checkoutSteps.navigateTo("http://qa2.madison.com/");

        checkoutSteps.clickOnProduct();

        checkoutSteps.clickOnColor();

        checkoutSteps.clickOnSize();

        checkoutSteps.clickOnAddToCart();

        checkoutSteps.clickOnProceedToCheckout();

        checkoutSteps.loginFlow(username, password);

        checkoutSteps.selectAddress(selectAddress);

        checkoutSteps.clearFields();

        checkoutSteps.billingInformationCheckoutLogin(testData.getFirstName(), testData.getLastName(),
                testData.getAddress(), testData.getCity(), testData.getPostalCode(), testData.getCountry(), testData.getTelephone());
        checkoutSteps.clickOnContinue();
    }
}