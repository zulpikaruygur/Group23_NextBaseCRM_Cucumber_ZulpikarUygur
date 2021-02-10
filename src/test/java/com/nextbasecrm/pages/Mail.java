package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mail {


    //logout from dropdown menu--
    @FindBy(linkText = "Log out")
    public WebElement logOut;

    //account username--
    @FindBy(id = "user-name")
    public WebElement userName;

    //Tasks from the "dropdown Menu Next To Logo"--
    @FindBy(xpath = "(//a[contains(text(), 'Tasks')])[1]")
    public WebElement tasksFromDropdownMenu;


}
