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

    // search icon ++
    @FindBy(css = "span.main-ui-item-icon.main-ui-search")
    public WebElement searchIcon;

    // Sort by
    @FindBy(xpath = "//*[contains(text(), 'Sort by')]")
    public WebElement sortBy;

    // sort by categories
    @FindBy(css = "bx-sonet-groups-sort-value")
    public WebElement sortByCategories;

    // sort by -- ABC order
    @FindBy(xpath = "(//*[contains(text(), 'ABC order')])[2]")
    public WebElement sortBy_abcOrder;

    // sort by -- Time joined
    @FindBy(xpath = "(//*[contains(text(), 'Time joined')])[2]")
    public WebElement sortBy_timeJoined;

    // sort by -- Last viewed
    @FindBy(xpath = "(//*[contains(text(), 'Last viewed')])[2]")
    public WebElement sortBy_lastViewed;

    // sort by -- Number of members
    @FindBy(xpath = "(//*[contains(text(), 'Number of members')])[2]")
    public WebElement sortBy_numberOfMembers;

    // sort by -- Last active
    @FindBy(xpath = "(//*[contains(text(), 'Last active')])[2]")
    public WebElement sortBy_lastActive;

    // sort by -- Time creatd
    @FindBy(xpath = "(//*[contains(text(), 'Time created')])[2]")
    public WebElement sortBy_timeCreated;

    // groups -- new corporate identity
    @FindBy(xpath = "(//*[contains(text(),'\"New Corporate Identity\" project')])[2]")
    public WebElement groups_newCorpIden;

    // groups -- corporate christmas party
    @FindBy(xpath = "(//*[contains(text(),'Corporate Christmas Party')])[2]")
    public WebElement groups_corChrisParty;

    // groups -- New company web site development
    @FindBy(xpath = "(//*[contains(text(),'New company web site development')])[2]")
    public WebElement groups_newWebsite;

    // groups -- New product development
    @FindBy(xpath = "(//*[contains(text(),'New product development')])[2]")
    public WebElement groups_newProDev;

    // groups -- PR and advertising
    @FindBy(xpath = "(//*[contains(text(),'PR and advertising')])[2]")
    public WebElement groups_prAndAd;

    // groups -- sales
    @FindBy(xpath = "(//*[contains(text(),'Sales')])[2]")
    public WebElement groups_sales;

    // groups -- Soccer team
    @FindBy(xpath = "(//*[contains(text(),'Soccer team')])[2]")
    public WebElement groups_socTeam;

    // groups -- Technology
    @FindBy(xpath = "(//*[contains(text(),'Technology')])[2]")
    public WebElement groups_tech;

    // description -- New Corporate Identity" project
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[1]/div[1]/span[2]/span[2]")
    public WebElement description_newCorpIden;

    // description -- Corporate Christmas Party
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[1]/div[2]/span[2]/span[2]")
    public WebElement description_corChrisParty;

    // description -- New company web site development
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[2]/div[1]/span[2]/span[2]")
    public WebElement description_newWebsite;

    // description -- New product development
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[2]/div[2]/span[2]/span[2]")
    public WebElement description_newProDev;

    // description -- PR and advertising
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[3]/div[1]/span[2]/span[2]")
    public WebElement description_prAndAd;

    // description -- Sales
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[3]/div[2]/span[2]/span[2]")
    public WebElement description_sales;

    // description -- Soccer team
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[4]/div[1]/span[2]/span[2]")
    public WebElement description_socTeam;

    // description -- Technology
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[4]/div[2]/span[2]/span[2]")
    public WebElement description_tech;

    // number of members -- New Corporate Identity" project
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[1]/div[1]/span[2]/span[3]")
    public WebElement members_newCorpIden;

    // number of members -- Corporate Christmas Party
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[1]/div[2]/span[2]/span[3]")
    public WebElement members_corChrisParty;

    // number of members -- New company web site development
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[2]/div[1]/span[2]/span[3]")
    public WebElement members_newWebsite;

    // number of members -- New product development
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[2]/div[2]/span[2]/span[3]")
    public WebElement members_newProDev;

    // number of members -- PR and advertising
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[3]/div[1]/span[2]/span[3]")
    public WebElement members_prAndAd;

    // number of members -- Sales
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[3]/div[2]/span[2]/span[3]")
    public WebElement members_sales;

    // number of members -- Soccer team
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[4]/div[1]/span[2]/span[3]")
    public WebElement members_socTeam;

    // number of members -- Technology
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[4]/div[2]/span[2]/span[3]")
    public WebElement members_tech;

}