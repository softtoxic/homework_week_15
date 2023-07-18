package xyz.bank.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import xyz.bank.demo.utilities.Utility;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement managerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;


    public void setManagerLogin() {
        clickOnElement(managerLogin);
    }


    public void setCustomerLogin() {
        clickOnElement(customerLogin);
    }

}
