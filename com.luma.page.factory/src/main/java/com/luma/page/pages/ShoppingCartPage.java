package com.luma.page.pages;

import com.luma.page.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifySize;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyColour;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement verifyBagName;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement verifyQty;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement verifyThePrice;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement changeQty;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement clickUpdate;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement verifyLastPrice;

    public String verifyTextMessage() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Text Message " + verifyText.toString());
        return getTextFromElement(verifyText);
    }

    public String verifyProductName() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Name " + verifyName.toString());
        return getTextFromElement(verifyName);
    }

    public String verifyProductSize() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Size " + verifySize.toString());
        return getTextFromElement(verifySize);
    }

    public String verifyProductColour() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Colour " + verifyColour.toString());
        return getTextFromElement(verifyColour);
    }

    public String verifyTheBagName() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Bag Name " + verifyBagName.toString());
        return getTextFromElement(verifyBagName);
    }

    public String verifyTheQuantityNumber() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Quantity " + verifyQty.toString());
        return getAttributeValueFromElement(verifyQty);
    }

    public String verifyTheProductPriceInCart() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Price In Cart" + verifyThePrice.toString());
        return getTextFromElement(verifyThePrice);
    }

    public void changeQuantity5() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Change Quantity" + changeQty.toString());
        sendTextToElement(changeQty, "5");
    }

    public void clickOnUpdateShoppingCart() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click On Update shopping Cart" + clickUpdate.toString());
        clickOnElement(clickUpdate);
    }

    public String verifyTheUpdateCartPrice() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Verify The Update CartPrice" + verifyLastPrice.toString());
        return getTextFromElement(verifyLastPrice);

    }

}
