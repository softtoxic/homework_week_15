package com.luma.page.testsuite;

import com.luma.page.customlisteners.CustomListeners;
import com.luma.page.pages.GearBagsPage;
import com.luma.page.pages.HomePage;
import com.luma.page.pages.OvernightDufflePage;
import com.luma.page.pages.ShoppingCartPage;
import com.luma.page.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    HomePage homePage;
    GearBagsPage gearBagsPage;
    OvernightDufflePage overnightDufflePage;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        gearBagsPage = new GearBagsPage();
        overnightDufflePage = new OvernightDufflePage();
        shoppingCartPage = new ShoppingCartPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Hoover on gear menu
        homePage.mouseHooverToGearMenu();
        // Hoover on gear menu and click on bags
        homePage.clickOnBags();
        // Click on overnight Duffle Bag
        gearBagsPage.clickOnProductNameOvernightDuffle();
        // Verify the text name of overnight Duffle
        Assert.assertEquals(overnightDufflePage.verifyProduceName(), "Overnight Duffle");
        //Change Qty 3
        overnightDufflePage.changeQuantity("3");
        // Click on ‘Add to Cart’ Button.
        overnightDufflePage.clickOnAddCartButton();
        //Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(overnightDufflePage.verifyTheBagShoppingCartText(), "You added Overnight Duffle to your shopping cart.");
        // Click on ‘shopping cart’ Link into message
        overnightDufflePage.clickOnBagShoppingCartLink();
        //Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.verifyTheBagName(), "Overnight Duffle");
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.verifyTheQuantityNumber(), "3");
        //Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.verifyTheProductPriceInCart(), "$135.00");
        // Change Qty to '5'
        shoppingCartPage.changeQuantity5();
        //Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        // Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingCartPage.verifyTheUpdateCartPrice(), "$225.00");

    }
}
