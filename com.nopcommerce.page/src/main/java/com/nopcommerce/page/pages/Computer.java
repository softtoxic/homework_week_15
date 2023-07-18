package com.nopcommerce.page.pages;

import com.nopcommerce.page.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Computer extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktopsTab;
    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement sortByZtoA;
    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement sortByAtoZ;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement radioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement vistaPremium;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microsoftOffice;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement getAmount;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart1;
    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'product ')]")
    WebElement message;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeTheBar;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(className = "qty-input")
    By qtyBox = By.className("qty-input");
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement agreeTermsOfService;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutBox;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkoutAsGuest;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement radioButtonShipping;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueShipping;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement radioCreditCard;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueOnCreditCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expDate;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueToPay;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement getPaymentMethodText;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement getShippingMethod;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement totalPaymentPaid;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmToPayment;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouMessage;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfullyProcessed;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueOnPay;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToOrStore;


    public void clickOnComputerMenu() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Computer menu "+computerMenu.toString());
        mouseHoverToElement(computerMenu);
    }

    public void clickOnDesktopsTab() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Desktop "+desktopsTab.toString());
        mouseHoverToElementAndClick(desktopsTab);
    }

    public void sortByNameZtoA() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Sort by name Z to A "+sortByZtoA.toString());
        clickOnElement(sortByZtoA);
    }

    public String getSortByNameZtoA() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Get text from name Z to A "+sortByZtoA.toString());
        return getTextFromElement(sortByZtoA);
    }

    /*******************************************************************************/
    // 2.3 Select Sort By position "Name: A to Z"
    public void sortByNameAtoZ() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Name A to Z "+sortByAtoZ.toString());
        clickOnElement(sortByAtoZ);
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Add to cart " +addToCart.toString());
        clickOnElement(addToCart);
    }

    //  Verify the Text "Build your own computer
    public String getText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Get text from element "+buildText.toString());
        return getTextFromElement(buildText);
    }

    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void selectProcessor() {
        Reporter.log("Select processor "+processor.toString());
        selectByIndexFromDropDown(processor, 1);
    }

    //2.7.Select "8GB [+$60.00]" using Select class.
    public void selectRam() {
        Reporter.log("Select Ram "+ram.toString());
        selectByIndexFromDropDown(ram, 3);
    }

    //2.8 Select HDD radio "400 GB [+$100.00]"
    public void selectRadioButton() {
        Reporter.log("Check radio button " +radioButton.toString());
        clickOnElement(radioButton);
    }

    //2.9 Select OS radio "Vista Premium [+$60.00]"
    public void selectVistaPremium() {
        clickOnElement(vistaPremium);
    }
    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"

    public void checkTwoBoxes() {
        clickOnElement(microsoftOffice);
        clickOnElement(microsoftOffice);
        clickOnElement(totalCommander);
    }

    //  Verify the price "$1,475.00
    public String getTotalAmount() {
        return getTextFromElement(getAmount);

    }

    // 2.12 Click on "ADD TO CARD" Button
    public void clickToAddToCart() {
        clickOnElement(addToCart1);

    }

    public String getTheMessage() {
        return getTextFromElement(message);
    }

    // After that close the bar clicking on the cross button.
    public void closeTheBar() {
        clickOnElement(closeTheBar);
    }

    // Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
    public void shoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void clickToGoCart() {
        clickOnElement(goToCart);
    }

    // Verify the message "Shopping cart"
    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartMessage);
    }

    //2.16 Change the Qty to "2" and Click on "Update shopping cart"
    public void clearAndAddQuantity() {
        clearTextFromField(qtyBox);
        sendTextToElement(qtyBox, "2");
        clickOnElement(updateShoppingCart);
    }

    // 2.17 Verify the Total"$2,950.00"
    public String getTotalAmount1() {
        return getTextFromElement(totalAmount);
    }

    public void clickOnTermsOfService() {
        clickOnElement(agreeTermsOfService);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkoutBox);
    }

    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }

    // 2.21Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkoutAsGuest);
    }

    //2.22 Fill the all mandatory field
    public void firstNameField(String name) {
        sendTextToElement(firstName, name);
    }

    public void lastNameField(String last) {
        sendTextToElement(lastName, last);
    }

    public void emailField(String EmailID) {
        sendTextToElement(email, EmailID);
    }

    public void countryField(String Country) {
        selectByValueFromDropDown(country, Country);
    }

    public void cityField(String City) {
        sendTextToElement(city, City);
    }

    public void address1Field(String Address1) {
        sendTextToElement(address1, Address1);
    }

    public void postalCodeField(String PostCode) {
        sendTextToElement(postalCode, PostCode);
    }

    public void phoneNumberField(String PhoneNumber) {
        sendTextToElement(phoneNumber, PhoneNumber);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }

    public void clickOnRadioButton() {
        clickOnElement(radioButtonShipping);
    }

    public void clickOnContinueShippingMethod() {
        clickOnElement(continueShipping);
    }

    public void clickOnRadioCreditCard() {
        clickOnElement(radioCreditCard);
    }

    public void clickOnContinueOnCreditCard() {
        clickOnElement(continueOnCreditCard);
    }

    // Select “Master card” From Select credit card dropdown
    //2.28 Fill all the details
    //2.29 Click on “CONTINUE”
    public void selectMasterCard(String MasterCard) {
        selectByValueFromDropDown(creditCardType, MasterCard);
    }

    public void cardHolderNameField(String HolderName) {
        sendTextToElement(cardHolderName, HolderName);
    }

    public void creditCardNumberField(String CardNumber) {
        sendTextToElement(cardNumber, CardNumber);
    }

    public void selectExpiryMonthField(String Month) {
        selectByValueFromDropDown(expDate, Month);
    }

    public void selectExpiryYearField(String Year) {
        selectByValueFromDropDown(expYear, Year);
    }

    public void cardCodeNumberField(String CardCode) {
        sendTextToElement(cardCode, CardCode);
    }

    public void clickContinueToPayment() {
        clickOnElement(continueToPay);
    }

    //2.30 Verify “Payment Method” is “Credit Card”
    public String getPaymentMethod() {
        return getTextFromElement(getPaymentMethodText);
    }

    //2.32 Verify “Shipping Method” is “Next Day Air”
    public String getShippingMethod() {
        return getTextFromElement(getShippingMethod);
    }

    //2.33 Verify Total is “$2,950.00”
    public String getTotalPaymentPaid() {
        return getTextFromElement(totalPaymentPaid);
    }

    //2.34 Click on “CONFIRM”
    public void clickConfirmToPay() {
        clickOnElement(confirmToPayment);
    }

    //2.35 Verify the Text “Thank You”
    public String getVerifyTheThankYouMessage() {
        return getTextFromElement(thankYouMessage);
    }

    //2.36 Verify the message “Your order has been successfully processed!”
    public String getToVerifyYourOrderHasBeenSuccessfullyProcessed() {
        return getTextFromElement(successfullyProcessed);
    }

    //2.37 Click on “CONTINUE”
    public void clickOnContinue3() {
        clickOnElement(continueOnPay);
    }

    //2.37 Verify the text “Welcome to our store
    public String getToVerifyWelcomeToOurStore() {
        return getTextFromElement(welcomeToOrStore);
    }
}
