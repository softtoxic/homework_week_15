package com.nopcommerce.page.pages;

import com.nopcommerce.page.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Electronics extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement cellPhoneText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement getTextNokia;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyThePrice;
   // @CacheLookup
   // @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
   // WebElement quantity;
    By quantity = By.xpath( "//input[@id='product_enteredQuantity_20']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyTheMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeTheBar;
    @CacheLookup
    @FindBy(xpath = "//li[@id='topcartlink']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(css = "#itemquantity11243")
    WebElement verifyQuantity;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement verifyTheTotal;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkBox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement register;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement gender;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@name= 'Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerTab;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerCompleteText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueAfterRegistration;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailLoginField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordLoginField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkBoxTermsOfService;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement finalCheckOut;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_StateProvinceId']")
    WebElement stateField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCodeField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement updateContinue;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement shippingOption2;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueAfterCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement selectCardType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement selectExpDate;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement selectExpYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeFiled;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueAfterPaymentDetails;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement paymentByCreditCard;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodBy2ndDayAir;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$698.00')]")
    WebElement totalPaymentToPay;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmAfterPayment;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouMessage;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfullyProcessedMessage;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueAfterSuccessfullyMessage;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToOurStore;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logOut;


    //1.1 Mouse Hover on “Electronics” Tab
    public void mouseHoverOnElectronics() {
        mouseHoverToElement(electronics);
    }

    //1.2 Mouse Hover on “Cell phones” and click
    public void mouseHoverAndClickOnCellPhones() {
        mouseHoverToElementAndClick(cellPhone);
    }

    //1.3 Verify the text “Cell phones”
    public String GetTextCellPhones() {
        return getTextFromElement(cellPhoneText);
    }
    //2.1 Mouse Hover on “Electronics” Tab
    //2.2 Mouse Hover on “Cell phones” and click
    //2.3 Verify the text “Cell phones”

    // 2.4 Click on List View Tab
    public void clickOnListViewTab() {
        clickOnElement(listView);
    }

    //2.5 Click on product name “Nokia Lumia 1020” link
    public void clickOnNokiaLumia1020() {
        clickOnElement(nokiaLumia1020);
    }

    //2.6 Verify the text “Nokia Lumia 1020”//2.7
    public String getTextNokiaLumia1020() {
        return getTextFromElement(getTextNokia);
    }

    // Verify the price “$349.00”//
    public String getToVerifyThePrice() {
        return getTextFromElement(verifyThePrice);
    }

    // 2.8 Change quantity to 2
    public void changeQuantityTo2() {
        clearTextFromField(quantity);
        sendTextToElement(quantity, "2");
    }

    //2.9 Click on “ADD TO CART” tab
    public void clickAddToCart() {
        clickOnElement(addToCart);
    }
    //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar

    public String getToVerifyTheMessage() {
        return getTextFromElement(verifyTheMessage);
    }

    // After that close the bar clicking on the cross button

    public void closeTheBarClickingOnTheCrossButton() {
        clickOnElement(closeTheBar);
    }
    //2.11  Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.

    public void mouseHoverShoppingCart() {

        mouseHoverToElement(shoppingCart);
    }

    public void clickToGoCart() {
        clickOnElement(goToCart);
    }

    //2.12 Verify the message "Shopping cart"
    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartText);
    }

    //2.13 Verify the quantity is 2
    public String getVerifyTheQuantity() {
        return getTextFromElement(verifyQuantity);
    }

    //2.14 Verify the Total $698.00
    public String getToVerifyTheTotal() {
        return getTextFromElement(verifyTheTotal);
    }

    //2.15 click on checkbox “I agree with the terms of service”
    public void clickToCheckBox() {
        clickOnElement(checkBox);
    }

    //2.16 Click on “CHECKOUT”
    public void clickToCheckOut() {
        clickOnElement(checkOut);
    }

    // 2.17 Verify the Text “Welcome, Please Sign In!”
    public String getToVerifyWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }

    // 2.18 Click on “REGISTER” tab
    public void clickOnRegister() {
        clickOnElement(register);
    }

    //2.19 Verify the text “Register”
    public String getToVerifyRegisterText() {
        return getTextFromElement(registerText);
    }

    //2.20 Fill the mandatory fields

    public void clickOnGenderField() {
        clickOnElement(gender);
    }

    public void firstNameField(String FirstName) {
        sendTextToElement(firstName, FirstName);
    }

    public void lastNameField(String LastName) {
        sendTextToElement(lastName, LastName);
    }


    public void emailField(String EmailID) {
        sendTextToElement(email, EmailID);
    }

    public void passwordField(String Password) {
        sendTextToElement(password, Password);
    }

    public void confirmPasswordField(String ConPassword) {
        sendTextToElement(confirmPassword, ConPassword);
    }

    //2.21 Click on “REGISTER” Button

    public void clickOnRegisterTab() {
        clickOnElement(registerTab);
    }
    //2.22 Verify the message “Your registration completed”

    public String getToVerifyRegisteraionComplete() {
        return getTextFromElement(registerCompleteText);
    }

    //2.23 Click on “CONTINUE” tab
    public void clickOnContinueAfterRegistration() {
        clickOnElement(continueAfterRegistration);
    }
    // Login again because cart is empty

    public void clickOnLoginAbove() {
        clickOnElement(login);
    }

    public void inputOnEmailLoginField(String EmailId) {
        sendTextToElement(emailLoginField, EmailId);
    }

    public void inputOnPasswordLoginField(String Password) {
        sendTextToElement(passwordLoginField, Password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

//2.24 Verify the text “Shopping cart”

    public String getToVerifyShoppingCartText() {
        return getTextFromElement(shoppingCartText1);
    }

    //2.25 click on checkbox “I agree with the terms of service”
    public void clickOnCheckBox() {
        clickOnElement(checkBoxTermsOfService);
    }
    // 2.26 Click on “CHECKOUT”

    public void clickOnFinalCheckOut() {
        clickOnElement(finalCheckOut);
    }

    // 2.27 Fill the Mandatory fields
    public void selectCountryField(String Country) {
        selectByValueFromDropDown(countryField, Country);
    }

    public void selectStateField(String State) {
        selectByValueFromDropDown(stateField, State);
    }

    public void inputOnCityField(String City) {
        sendTextToElement(cityNameField, City);
    }

    public void inputOnAddressField(String Address) {
        sendTextToElement(addressField, Address);
    }

    public void inputOnPostalField(String PostCode) {
        sendTextToElement(postalCodeField, PostCode);
    }

    public void inputOnPhoneNumber(String PhoneNumber) {
        sendTextToElement(phoneNumber, PhoneNumber);
    }

    //2.28 Click on “CONTINUE”
    public void clickOnContinueAfterAllMandatoryFields() {
        clickOnElement(updateContinue);
    }

    // 2.29 Click on Radio Button “2nd Day Air ($0.00)”
    public void clickOnShipping2Option() {
        clickOnElement(shippingOption2);
    }

    // 2.30 Click on “CONTINUE”
    public void clickOnContinueButtonAfterSelectingShippingOption() {
        clickOnElement(continueButton);
    }

    // 2.31 Select Radio Button “Credit Card”
    public void clickOnRadioButton() {
        clickOnElement(paymentMethod);
    }

    public void continueAfterCreditCard() {
        clickOnElement(continueAfterCard);
    }

    //2.33 Fill all the details
    public void selectCreditCardType(String CardType) {
        selectByValueFromDropDown(selectCardType, CardType);
    }

    public void inputCardHolderName(String HolderName) {
        sendTextToElement(cardHolderNameField, HolderName);
    }

    public void inputCardNumberField(String CardNumber) {
        sendTextToElement(cardNumberField, CardNumber);
    }

    public void selectExpiryDateField(String Date) {
        selectByValueFromDropDown(selectExpDate, Date);
    }

    public void selectExpiryYearField(String Year) {
        selectByValueFromDropDown(selectExpYear, Year);
    }

    public void inputCreditCardCode(String CardCode) {
        sendTextToElement(cardCodeFiled, CardCode);
    }

    //2.34 Click on “CONTINUE”
    public void continueAftersSuccessfullyProcessed() {
        clickOnElement(continueAfterPaymentDetails);
    }

    //2.35 Verify “Payment Method” is “Credit Card”
    public String getToVerifyPaymentMethodByCard() {
        return getTextFromElement(paymentByCreditCard);
    }

    //2.36 Verify “Shipping Method” is “2nd Day Air”
    public String getToVerifyShippingMethod() {
        return getTextFromElement(shippingMethodBy2ndDayAir);
    }

    //2.37 Verify Total is “$698.00”

    public String getToVerifyTotalFinalAmount() {
        return getTextFromElement(totalPaymentToPay);
    }

    //2.38 Click on “CONFIRM”
    public void clickOnConfirmAfterPayment() {
        clickOnElement(confirmAfterPayment);
    }


    //2.39 Verify the Text “Thank You”

    public String getToVerifyThankYouMessage() {
        return getTextFromElement(thankYouMessage);
    }

    //2.40 Verify the message “Your order has been successfully processed!”

    public String getToVerifySuccessfullyProcessedMessage() {
        return getTextFromElement(successfullyProcessedMessage);
    }

    //2.41 Click on “CONTINUE”
    public void clickOnContinueAfterSuccessfullyMessage() {
        clickOnElement(continueAfterSuccessfullyMessage);
    }


    //2.42 Verify the text “Welcome to our store”
    public String getToVerifyWelcomeToOurStoreMessage() {
        return getTextFromElement(welcomeToOurStore);
    }

    //2.43 Click on “Logout” link
    public void clickOnLogOut() {
        clickOnElement(logOut);
    }


    //2.44 Verify the URL is “https://demo.nopcommerce.com/
    public void checkTheCurrentUrl() {
        driver.getCurrentUrl();
    }

}
