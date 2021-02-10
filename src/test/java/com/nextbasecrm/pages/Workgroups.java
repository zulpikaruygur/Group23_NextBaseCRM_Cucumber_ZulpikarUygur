package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Workgroups extends BasePage {

    // page title
    @FindBy (css = "span#pagetitle")
    public WebElement pageTitle;

    // add to favourite star
    @FindBy (css = "span#bx-sonet-groups-favorites-8")
    public WebElement addToFavStar;

    // search bar
    @FindBy (css = "input#SONET_GROUP_LIST_search")
    public WebElement searchBar;

    // search icon
    @FindBy(css = "span.main-ui-item-icon.main-ui-search")
    public WebElement searchIcon;
}