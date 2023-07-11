package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ManPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    ManPage manPage = new ManPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //* Mouse Hover on Men Menu
        //* Mouse Hover on Bottoms
        //* Click on Pants
        homePage.MouseHoverToMenMenu();
        //Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on size
        //32.
        manPage.cronusSize();
        manPage.ClickOnSizeMen();
        //* Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on colour
        //Black.
        manPage.cronusColour();

        //* Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on
        //‘Add To Cart’ Button.
        manPage.addToCartMen();

        //* Verify the text
        //‘You added Cronus Yoga Pant to your shopping cart.’
        manPage.verifyTheAddText();
        //* Click on ‘shopping cart’ Link into
        //message
        manPage.clickOnShoppingCart();
        //* Verify the text ‘Shopping Cart.’
        manPage.verifyTextShoppingCart();

        //* Verify the product name ‘Cronus Yoga Pant’
        manPage.verifyTextCronusPant();
        //* Verify the product size ‘32’
        manPage.verifySizeText();
        //* Verify the product colour ‘Black’
        manPage.verifyColourText();


    }


}
