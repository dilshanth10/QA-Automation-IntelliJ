package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * CheckBoxPage.java - class to verify CheckBox Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class CheckBoxPage extends PageBase {

    private static By hdrABTest = By.xpath("//h3");
    public static boolean isABTestPageDisplayed() {
        return getDriver().findElement(hdrABTest).isDisplayed();
    }
    public static void waitTillHeaderLoad() {
        waiTillVisible(hdrABTest, 2);
    }
}
