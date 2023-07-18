package com.luma.page.testsuite;

import com.luma.page.customlisteners.CustomListeners;
import com.luma.page.pages.HomePage;
import com.luma.page.pages.MenPage;
import com.luma.page.pages.ShoppingCartPage;
import com.luma.page.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage;
    MenPage menPage;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        menPage = new MenPage();
        shoppingCartPage = new ShoppingCartPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Men Menu
        homePage.mouseHooverToMenMenu();
        // Mouse Hover on Bottoms
        homePage.mouseHooverToBottomsMenu();
        // Click on Pants
        homePage.clickOnPants();
        // Mouse Hoover to click on product size and click
        menPage.clickOnPantSize();
        // Mouse Hoover to select the colour and click
        menPage.clickOnPantColour();
        //Mouse Hoover to add to cart and click
        menPage.clickOnAddToCart();
        Assert.assertEquals(menPage.verifyAddedItemToTheShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.");
        // Click on ‘shopping cart’ Link into message
        menPage.shoppingCartLink();
        // Verify the text ‘Shopping Cart.','Cronus Yoga Pant','32','Black'
        Assert.assertEquals(shoppingCartPage.verifyTextMessage(), "Shopping Cart");
        Assert.assertEquals(shoppingCartPage.verifyProductName(), "Cronus Yoga Pant");
        Assert.assertEquals(shoppingCartPage.verifyProductSize(), "32");
        Assert.assertEquals(shoppingCartPage.verifyProductColour(), "Black");

    }
}
