package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * DropDownPage.java - class to verify DropDown Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class DropDownPage extends PageBase {

    private static By dropDownMenu = By.id("dropdown");
    private static By firstDropDownOption = By.xpath("//*[@id=\"dropdown\"]/option[@value='1']");

    public static boolean isDropDownPageDisplayed() {
        return getDriver().findElement(dropDownMenu).isDisplayed();
    }

    public static void setDropDownOption(String option) {
        Select dropDownOption = new Select(getDriver().findElement(dropDownMenu));
        dropDownOption.selectByVisibleText(option);
    }

    public static String getSeletedOption() {
        Select dropDownOption = new Select(getDriver().findElement(dropDownMenu));
        return dropDownOption.getFirstSelectedOption().getText();
    }


    public static void waitTillHeaderLoad() {
        waiTillVisible(dropDownMenu, 2);
    }
}
