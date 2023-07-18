package xyz.bank.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import xyz.bank.demo.utilities.Utility;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchUser;
    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement processButton;


    public void setOpenAccount() {
        Reporter.log("Click on open account button : " + openAccount.toString());
        clickOnElement(openAccount);
    }

    public void setSearchUser(String DropDown) {
        Reporter.log("Search user from drop down menu : " + searchUser.toString());
        selectByVisibleTextFromDropDown(searchUser, DropDown);
    }

    public void setSelectCurrency(String currency) {
        Reporter.log("Select currency : " + selectCurrency.toString());
        selectByVisibleTextFromDropDown(selectCurrency, currency);
    }



    public void setProcessButton() {
        Reporter.log("Click on process button : " + processButton.toString());
        clickOnElement(processButton);
    }
}
