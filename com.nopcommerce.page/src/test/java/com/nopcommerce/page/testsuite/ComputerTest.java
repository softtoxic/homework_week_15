package com.nopcommerce.page.testsuite;

import com.nopcommerce.page.customlisteners.CustomListeners;
import com.nopcommerce.page.pages.Computer;
import com.nopcommerce.page.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {
    Computer computer;

    @BeforeMethod(alwaysRun = true)

    public void inIt() {
        computer = new Computer();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheProductWillArrangeInDescendingOrder() throws InterruptedException {
        Thread.sleep(1000);
        computer.clickOnComputerMenu();
        Thread.sleep(1000);
        computer.clickOnDesktopsTab();
        Thread.sleep(1000);
        computer.sortByNameZtoA();
        Thread.sleep(1000);
        // 1.4 Verify the Product will arrange in Descending order.
        String expectedDisplay = "Name: Z to A";
        String actualDisplay = computer.getSortByNameZtoA();
        Assert.assertEquals(expectedDisplay, actualDisplay);

    }
    @Test(groups = {"regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        Thread.sleep(1000);
        computer.clickOnComputerMenu();
        Thread.sleep(1000);
        computer.clickOnDesktopsTab();
        Thread.sleep(1000);
        computer.sortByNameAtoZ();
        Thread.sleep(1000);
        computer.clickOnAddToCart();
        //  Verify the Text "Build your own computer
        Thread.sleep(1000);
        String expectedText = "Build your own computer";
        String actualText = computer.getText();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(1000);
        computer.selectProcessor();
        Thread.sleep(1000);
        computer.selectRam();
        Thread.sleep(1000);
        computer.selectRadioButton();
        Thread.sleep(1000);
        computer.selectVistaPremium();
        Thread.sleep(1000);
        computer.checkTwoBoxes();
        Thread.sleep(1000);
        //  Verify the price "$1,475.00

        //    String actualAmount = computer.getTotalAmount();
        //     String expectedAmount = "$1,475.00";
        //    Assert.assertEquals(actualAmount,expectedAmount);
        computer.clickToAddToCart();
        Thread.sleep(1000);
        // Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualMessage = computer.getTheMessage();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage,expectedMessage);
        Thread.sleep(1000);
        computer.closeTheBar();
        // Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(1000);
        computer.shoppingCart();
        Thread.sleep(1000);
        computer.clickToGoCart();
        Thread.sleep(1000);
        // Verify the message "Shopping cart"
        String expectedMessage2 = "Shopping cart";
        String actualMessage2 = computer.getShoppingCartMessage();
        Assert.assertEquals(expectedMessage2, actualMessage2);
        Thread.sleep(1000);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computer.clearAndAddQuantity();
        Thread.sleep(1000);
        //2.17 Verify the Total"$2,950.00"
        String expectedTotalAmount = "$2,950.00";
        String actualTotalAmount = computer.getTotalAmount1();
        Assert.assertEquals(expectedTotalAmount, actualTotalAmount);
        Thread.sleep(1000);
        //2.18 click on checkbox “I agree with the terms of service”
        computer.clickOnTermsOfService();
        Thread.sleep(1000);
        //2.19 Click on “CHECKOUT”
        computer.clickOnCheckOut();
        Thread.sleep(1000);
        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedWelcomeMessage = "Welcome, Please Sign In!";
        String actualWelcomeMessage = computer.getWelcomeMessage();
        Assert.assertEquals(expectedWelcomeMessage, actualWelcomeMessage);
        Thread.sleep(1000);
        //2.21Click on “CHECKOUT AS GUEST” Tab
        computer.clickOnCheckOutAsGuest();
        Thread.sleep(1000);
        //2.22 Fill the all mandatory field
        computer.firstNameField("rrr");
        Thread.sleep(1000);
        computer.lastNameField("ttt");
        Thread.sleep(1000);
        computer.emailField("rtrt@gmail.com");
        Thread.sleep(1000);
        computer.countryField("233");
        Thread.sleep(1000);
        computer.cityField("London");
        Thread.sleep(1000);
        computer.address1Field("12 Lindsay Avenue");
        Thread.sleep(1000);
        computer.postalCodeField("RG1 8NG");
        Thread.sleep(1000);
        computer.phoneNumberField("07852698543");
        Thread.sleep(1000);
        //2.23 Click on “CONTINUE
        computer.clickOnContinue();
        Thread.sleep(1000);
        //2 .24 Click on Radio Button “Next Day Air($0.00)”
        computer.clickOnRadioButton();
        Thread.sleep(1000);
        //  2.25 Click on “CONTINUE
        computer.clickOnContinueShippingMethod();
        Thread.sleep(1000);
        computer.clickOnRadioCreditCard();
        Thread.sleep(1000);
        computer.clickOnContinueOnCreditCard();
        Thread.sleep(1000);
        //2.27 Select “Master card” From Select credit card dropdown
        //2.28 Fill all the details
        computer.selectMasterCard("MasterCard");
        Thread.sleep(1000);
        computer.cardHolderNameField("rrr ttt");
        Thread.sleep(1000);
        computer.creditCardNumberField("5368392055488809");
        Thread.sleep(1000);
        computer.selectExpiryMonthField("2");
        Thread.sleep(1000);
        computer.selectExpiryYearField("2024");
        Thread.sleep(1000);
        computer.cardCodeNumberField("236");
        Thread.sleep(1000);
        //2.29 Click on “CONTINUE”
        computer.clickContinueToPayment();
        Thread.sleep(1000);
        //2.30 Verify “Payment Method” is “Credit Card”
        computer.getPaymentMethod();
        Thread.sleep(1000);
        //2.32 Verify “Shipping Method” is “Next Day Air”
        computer.getShippingMethod();
        Thread.sleep(1000);
        //2.33 Verify Total is “$2,950.00”
        String expectedTotalPayment = "$2,950.00";
        String actualTotalPayment = computer.getTotalPaymentPaid();
        Assert.assertEquals(expectedTotalPayment, actualTotalPayment);
        Thread.sleep(1000);
        //2.34 Click on “CONFIRM”
        computer.clickConfirmToPay();
        Thread.sleep(1000);
        //2.35 Verify the Text “Thank You”
        String expectedThankYouMessage = "Thank you";
        String actualThankYouMessage = computer.getVerifyTheThankYouMessage();
        Assert.assertEquals(expectedThankYouMessage, actualThankYouMessage);
        Thread.sleep(1000);
        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedOrderSuccessfullyMessage = "Your order has been successfully processed!";
        String actualOrderSuccessfullyMessage = computer.getToVerifyYourOrderHasBeenSuccessfullyProcessed();
        Assert.assertEquals(expectedOrderSuccessfullyMessage, actualOrderSuccessfullyMessage);
        Thread.sleep(1000);
        //2.37 Click on “CONTINUE”
        computer.clickOnContinue3();
        Thread.sleep(1000);
        //2.37 Verify the text “Welcome to our store
        String expectedWelcomeTextMessage = "Welcome to our store";
        String actualWelcomeTextMessage = computer.getToVerifyWelcomeToOurStore();
        Assert.assertEquals(expectedWelcomeTextMessage, actualWelcomeTextMessage);

    }
}
