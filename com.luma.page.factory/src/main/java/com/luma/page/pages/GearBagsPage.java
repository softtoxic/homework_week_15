package com.luma.page.pages;

import com.luma.page.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearBagsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffle;

    public void clickOnProductNameOvernightDuffle() throws InterruptedException {
        Reporter.log("Click On OvernightDuffle  " + overNightDuffle.toString());
        Thread.sleep(500);
        clickOnElement(overNightDuffle);
    }
}
