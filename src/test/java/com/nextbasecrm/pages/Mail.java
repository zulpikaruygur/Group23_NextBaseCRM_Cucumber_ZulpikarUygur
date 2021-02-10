package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mail {

    //logout from dropdown menu
    @FindBy(linkText = "Log out")
    public WebElement logOut;
}
