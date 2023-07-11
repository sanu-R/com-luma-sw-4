package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {


    By duffle = (By.xpath("//a[contains(text(),'Overnight Duffle')]"));
    By verifyText = (By.xpath("//span[@class='base']"));
    By clear = (By.xpath("//input[@id='qty']"));
    By addThree = (By.xpath("//input[@id='qty']"));
    By addTo = (By.xpath("//button[@id='product-addtocart-button']"));
    By verifyAddToCart = (By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    By clickOnShopp = (By.xpath("//a[contains(text(),'shopping cart')]"));
    By verifyCronusYoga = By.cssSelector("td[class='col item'] strong[class='product-item-name']");
    By verifyQty = (By.xpath("//input[@title='Qty']"));
    By verifyPrice = (By.xpath("(//span[@class='cart-price']//span)[2]"));
    By clearQty = By.cssSelector("td[class='col qty'] input[class*='input-text qty']");
    By reWriteQty = By.cssSelector("td[class='col qty'] input[class*='input-text qty']");
    By updateShopping = (By.xpath("//span[normalize-space()='Update Shopping Cart']"));
    By verifyProductPrice = (By.xpath("//span[@class='cart-price']//span[@class='price'][text()='$225.00']"));


    public void clickOnProductName() {
        clickOnElement(duffle);
    }

    public void verifyTextOvernightDuffle() {
        verifyText(verifyText, "Overnight Duffle", "Overnight Duffle not found");
    }

    public void clearTheQty() {
        driver.findElement(clear).clear();
    }

    public void addTheQty() {
        sendTextToElement(addThree, "3");
    }

    public void addToTheCart() {
        clickOnElement(addTo);
    }

    public void verifyTextAddToCart() {
        verifyText(verifyAddToCart, "You added Overnight Duffle to your shopping cart.", "Overnight Duffle not added");
    }

    public void clickOnShoppingCartForDuffle() {
        clickOnElement(clickOnShopp);
    }

    public void verifyTextCronusYogaPant() {
        verifyText(verifyCronusYoga, "Cronus Yoga Pant", "Cronus Yoga Pant not found");
    }

    public void verifyQtyIsThree() {
        getTextFromElement(verifyQty);
    }

    public void verifyThePrice() {
        verifyText(verifyPrice, "$135.00", "$135.00 not found");
    }

    public void clearQtyForYoga() {
        driver.findElement(clearQty).clear();
    }

    public void reWriteQtyToFive() {
        sendTextToElement(reWriteQty, "5");
    }

    public void updateTheShoppingCartClick() {
        clickOnElement(updateShopping);
    }

    public void verifyProductPriceLastTime() {
        getTextFromElement(verifyProductPrice);
    }


}