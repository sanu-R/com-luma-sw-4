package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();
    JacketsPage jacketsPage = new JacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() {

        //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        //* Click on Jackets
        homePage.MouseHoverToWomenMenu();
        //* Select Sort By filter “Product Name”
        jacketsPage.sortByProduce();
        //* Verify the products name display in alphabetical order
        jacketsPage.alphabeticalOder();


    }

    @Test
    public void verifyTheSortByPriceFilter() {
        //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        //* Click on Jackets
        homePage.MouseHoverToWomenMenu();
        //* Select Sort By filter “Price”
        jacketsPage.sortByPriceFilter();
        //* Verify the products price display in Low to High
        jacketsPage.verifyLowToHighText();


    }
}
