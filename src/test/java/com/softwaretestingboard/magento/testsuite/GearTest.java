package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gearPage = new GearPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //Mouse Hover on Gear Menu
        homePage.gearMenuHover();
        //* Click on Bags
        homePage.clickOnBags();
        //* Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnProductName();
        //* Verify the text ‘Overnight Duffle’
        gearPage.verifyTextOvernightDuffle();
        //* Change Qty 3
        gearPage.clearTheQty();
        gearPage.addTheQty();
        //* Click on ‘Add to Cart’ Button.
        gearPage.addToTheCart();
        //* Verify the text
        //‘You added Overnight Duffle to your shopping cart.’
        gearPage.verifyTextAddToCart();
        //* Click on ‘shopping cart’ Link into
        //message
        gearPage.clickOnShoppingCartForDuffle();
        //* Verify the product name ‘Cronus Yoga Pant’
        //   gearPage.verifyTextCronusYogaPant();
        //* Verify the Qty is ‘3’
        gearPage.verifyQtyIsThree();
        //* Verify the product price ‘$135.00’
        gearPage.verifyThePrice();
        //* Change Qty to ‘5’
        gearPage.clearQtyForYoga();
        gearPage.reWriteQtyToFive();
        //* Click on ‘Update Shopping Cart’ button
        gearPage.updateTheShoppingCartClick();
        //* Verify the product price ‘$225.00’
        gearPage.verifyProductPriceLastTime();


    }


}
