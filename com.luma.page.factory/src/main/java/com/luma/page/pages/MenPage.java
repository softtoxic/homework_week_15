package com.luma.page.pages;

import com.luma.page.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hooverPantSize;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement pantSize;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement hooverPantColour;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement pantColour;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHooverToBoth;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public void clickOnPantSize() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click on Pant Size " + pantSize.toString());
        mouseHoverToElement(hooverPantSize);
        mouseHoverToElementAndClick(pantSize);
    }

    public void clickOnPantColour() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click on Pant Colour " + pantColour.toString());
        mouseHoverToElement(hooverPantColour);
        mouseHoverToElementAndClick(pantColour);
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click On Add To Cart " + addToCart.toString());
        mouseHoverToElement(mouseHooverToBoth);
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyAddedItemToTheShoppingCart() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Add Items " + verifyShoppingCart.toString());
        return getTextFromElement(verifyShoppingCart);
    }

    public void shoppingCartLink() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Shopping Cart Link " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }
}
