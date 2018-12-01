package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginSecurePage.java - class to verify LoginSecure Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class LoginSecurePage extends PageBase {

    private static By insideLoginText = By.xpath("//h2[text()=' Secure Area']");
    private static By btnLogout = By.xpath("//i[text()=' Logout']");


    public static boolean isInsideLoginPageDisplayed() {
        return getDriver().findElement(insideLoginText).isDisplayed();
    }
    public static void clickBtnLogout() {
        getDriver().findElement(btnLogout).click();
    }
    public static void waitTillHeaderLoad() {
        waiTillVisible(insideLoginText, 5);
    }
}
