package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ManPage extends Utility {
    HomePage homePage = new HomePage();

    By cronusYoga = (By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
    By clickSize = (By.xpath("(//div[@class='swatch-option text'])[1]"));

    By colour = (By.xpath("(//div[@class='swatch-option color'])[1]"));
    By addToCart = (By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]"));
    By textYouAdded = (By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    By shoppingCart = (By.xpath("//a[normalize-space()='shopping cart']"));
    By verifyCart = (By.xpath("//span[@class='base']"));
    By verifyName = (By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"));
    By verifySize = (By.xpath("//dd[contains(text(),'32')]"));
    By verifyColour = (By.xpath("//dd[contains(text(),'Black')]"));

    public void cronusSize() {
        mouseHoverToElement(cronusYoga);
    }

    public void ClickOnSizeMen() {
        clickOnElement(clickSize);
    }

    public void cronusColour() {
        mouseHoverToElementAndClick(colour);
    }

    public void addToCartMen() {
        clickOnElement(addToCart);
    }

    public void verifyTheAddText() {
        verifyText(textYouAdded, "You added Cronus Yoga Pant to your shopping cart.", "‘You added Cronus Yoga Pant to your shopping cart not found.");
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public void verifyTextShoppingCart() {
        verifyText(verifyCart, "Shopping Cart", "Text not found");
    }

    public void verifyTextCronusPant() {
        verifyText(verifyName, "Cronus Yoga Pant", "Cronus Yoga Pant text not found");
    }

    public void verifySizeText() {
        verifyText(verifySize, "32", "Cronus Yoga Pant size text not found");
    }

    public void verifyColourText() {
        verifyText(verifyColour, "Black", "Cronus Yoga Pant colour text not found");
    }


}
