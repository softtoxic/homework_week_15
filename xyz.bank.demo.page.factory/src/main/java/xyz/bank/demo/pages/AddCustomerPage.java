package xyz.bank.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import xyz.bank.demo.utilities.Utility;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement enterFirstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement enterLastName;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement enterPostCode;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnAdd;


    public void setAddCustomer() {
        Reporter.log("Click on Add customer : " + addCustomer.toString());
        clickOnElement(addCustomer);
    }
    public void setEnterFirstName(String name) {
        Reporter.log("Enter first name : "+enterFirstName.toString());
        sendTextToElement(enterFirstName, name);
    }

    public void setEnterLastName(String name) {
        Reporter.log("Enter last name : "+enterLastName.toString());
        sendTextToElement(enterLastName, name);
    }

    public void setEnterPostCode(String postCode) {
        Reporter.log("Enter post code : "+enterPostCode.toString());
        sendTextToElement(enterPostCode, postCode);
    }

    public void setClickOnAdd() {
        Reporter.log("Cleck on Add button : "+clickOnAdd.toString());
        clickOnElement(clickOnAdd);
    }
}
