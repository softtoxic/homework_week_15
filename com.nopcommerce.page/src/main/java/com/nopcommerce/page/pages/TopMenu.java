package com.nopcommerce.page.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.page.customlisteners.CustomListeners;
import com.nopcommerce.page.utilities.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class TopMenu extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    List<WebElement> topMenuTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    public String verifyComputerText() {
        CustomListeners.test.log(Status.PASS, "Get text Computer");
        return getTextFromElement(computerText);
    }
    public void selectMenu(String menu) {
        try {
            List<WebElement> list = topMenuTab;
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(menu)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = topMenuTab;
        }
    }
}
