package xyz.bank.demo.pages;

import org.openqa.selenium.By;
import xyz.bank.demo.utilities.Utility;

public class CustomerLoginPage extends Utility {
    By searchCustomer = By.xpath("//select[@id='userSelect']");
    By loginButton = By.xpath("//button[@type='submit']");
    By logoutButton = By.xpath("//button[@class='btn logout']");
    By yourName = By.xpath("//label[normalize-space()='Your Name :']");
    By logout = By.xpath("//button[@class='btn logout']");
    By depositButton = By.xpath("//button[normalize-space()='Deposit']");
    By amount = By.xpath("//input[@placeholder='amount']");
    By deposit = By.xpath("//button[@type='submit']");
    By depositMessage = By.xpath("//span[@class='error ng-binding']");
    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrawlAmount = By.xpath("//input[@placeholder='amount']");
    By clickWithdraw = By.xpath("//button[@type='submit']");
    By withdrawMessage = By.xpath("//span[@class='error ng-binding']");


    public void setSearchCustomer(String dropDown) {
        selectByVisibleTextFromDropDown(searchCustomer, dropDown);
    }

    public void setLoginButton() {
        clickOnElement(loginButton);
    }

    public void setLogoutButton() {
        clickOnElement(logoutButton);
    }

    public String setYourName() {
        return getTextFromElement(yourName);
    }

    public String setLogout() {
        return getTextFromElement(logout);
    }

    public void setDepositButton() {
        clickOnElement(depositButton);
    }

    public void setAmount(String amounts) {
        sendTextToElement(amount, amounts);
    }

    public void setDeposit() {
        clickOnElement(deposit);
    }

    public String setDepositMessage() {
        return getTextFromElement(depositMessage);
    }

    public void setWithdrawl() {
        clickOnElement(withdrawl);
    }

    public void setWithdrawlAmount(String withdrawlAmounts) {
        sendTextToElement(withdrawlAmount, withdrawlAmounts);
    }

    public void setClickWithdraw() {
        clickOnElement(clickWithdraw);
    }
    public String setWithdrawMessage(){
        return getTextFromElement(withdrawMessage);
    }
}
