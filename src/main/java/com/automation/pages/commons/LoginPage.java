package com.automation.pages.commons;

import com.automation.pages.SeleniumTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends SeleniumTestBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //input / text field -----> tf_<fieldName>
    //button -----> btn_<buttonName>
    //checkBox -----> chk_<checkboxName>
    //radio button -----> rdo_<radioButtonName>
    //dropdown -----> dd_<dropdownName>

    By tf_userName = By.id("username");
    By ft_password = By.id("password");
    By btn_login = By.xpath("//button[text()='Login']");

    public void fillUserName(String userName){
        type(tf_userName,userName);
    }
}
