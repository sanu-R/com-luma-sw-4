package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class JacketsPage extends Utility {
    HomePage homePage = new HomePage();
    By sortby = (By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]"));
    By alphabetical = (By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]"));
    By priceFilter = (By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]"));
    By lowTo = (By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]"));

    public void sortByProduce() {
        selectByValueFromDropDown(sortby, "name");
    }

    public void alphabeticalOder() {
        assertVerifyText(alphabetical, "Set Ascending Direction", "Text not in alphabetical order");
    }

    public void sortByPriceFilter() {
        selectByValueFromDropDown(priceFilter, "price");

    }

    public void verifyLowToHighText() {
        verifyText(lowTo, "Set Descending Direction", "Text not in Ascending Direction ");

    }


}
