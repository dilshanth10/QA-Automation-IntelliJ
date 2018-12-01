package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {

    private static By loginPageText = By.xpath("//h2[text()='Login Page']");
    private static By txtUsername = By.id("username");
    private static By txtPassword = By.id("password");
    private static By btnLogin = By.xpath("//*[@id=\"login\"]/button");

    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(loginPageText).isDisplayed();
    }
    public static void addUsername(String username) {
        getDriver().findElement(txtUsername).sendKeys(username);
    }
    public static void addPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }
    public static void clickBtnLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public static void waitTillHeaderLoad() {
        waiTillVisible(loginPageText, 2);
    }

}
