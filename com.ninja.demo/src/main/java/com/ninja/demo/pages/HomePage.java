package com.ninja.demo.pages;

import com.ninja.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksLink;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsLinks;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyTab;
    By currencyList = By.xpath("//ul[@class = 'dropdown-menu']/li");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountTab;

    //
    By myAccountOptions = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");


    public void selectMenu(String menu) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//nav[@id='menu']//a[normalize-space()='" + menu + "']"));
    }

    public void mouseHoverOnDesktopsLinkAndClick() {
        mouseHoverToElementAndClick(desktopLink);
    }

    public void mouseHoverOnLaptopsAndNotebooksLinkAndClick() {
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
    }

    public void mouseHoverOnComponentLinkAndClick() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(componentsLinks);
    }

    public void selectCurrency(String currency) throws InterruptedException {
        clickOnElement(currencyTab);
        Thread.sleep(1000);
        List<WebElement> listOfElements = getListOfElements(currencyList);
        for (WebElement e : listOfElements) {
            if (e.getText().equalsIgnoreCase(currency)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnMyQAccountTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(myAccountTab);
    }

    public void selectMyAccountOptions(String option) {

        List<WebElement> myAccountList = getListOfElements(myAccountOptions);

        for (WebElement options : myAccountList) {
            if (options.getText().equalsIgnoreCase(option)) {
                options.click();
            }
        }
        myAccountList = getListOfElements(myAccountOptions);
    }
}
