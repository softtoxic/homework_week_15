package com.luma.page.pages;

import com.luma.page.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenLink;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement topLink;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menLink;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottomLink;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsLink;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearLink;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;


    public void mouserHooverToWomenMenu() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To WomenMenu " + womenLink.toString());
        mouseHoverToElement(womenLink);
    }

    public void mouseHooverToTopMenu() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Mouse Hoover To Top Menu " + topLink.toString());
        mouseHoverToElement(topLink);
    }

    public void clickOnJacket() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To Jacket Menu " + jacketLink.toString());
        mouseHoverToElementAndClick(jacketLink);
    }

    public void mouseHooverToMenMenu() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To Men Menu " + menLink.toString());
        mouseHoverToElement(menLink);
    }

    public void mouseHooverToBottomsMenu() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To Bottom Menu " + bottomLink.toString());
        mouseHoverToElement(bottomLink);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click On Pants " + pantsLink.toString());
        mouseHoverToElementAndClick(pantsLink);
    }

    public void mouseHooverToGearMenu() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To Gear Menu " + gearLink.toString());
        mouseHoverToElement(gearLink);
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click On Bags " + bags.toString());
        clickOnElement(bags);
    }
}
