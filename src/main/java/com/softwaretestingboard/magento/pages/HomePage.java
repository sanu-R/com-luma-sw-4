package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = (By.xpath("//span[normalize-space()='Women']"));
    By womenTops = (By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]"));
    By womenJackets = (By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"));
    By menMenu = (By.xpath("//span[contains(text(),'Men')]"));
    By bottoms = (By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]"));
    By pants = (By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]"));
    By gearMenu = By.xpath("//a[@id='ui-id-6']");
    By bags = (By.xpath("//span[contains(text(),'Bags')]"));


    public void MouseHoverToWomenMenu() {
        mouseHoverActionForThree(womenMenu, womenTops, womenJackets);
    }


    public void clickOnJackets() {
        clickOnElement(womenJackets);
    }

    public void MouseHoverToMenMenu() {
        mouseHoverActionForThree(menMenu, bottoms, pants);
    }

    public void gearMenuHover() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        clickOnElement(bags);
    }


}
