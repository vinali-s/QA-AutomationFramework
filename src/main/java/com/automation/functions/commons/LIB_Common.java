package com.automation.functions.commons;

import com.automation.functions.FunctionBase;
import com.automation.pages.commons.LoginPage;
import org.openqa.selenium.WebDriver;

public class LIB_Common extends FunctionBase {
    public LoginPage loginPage;

    public LIB_Common(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public void bc_login(String username , String password){
        loginPage.fillUserName(username);
    }
}
