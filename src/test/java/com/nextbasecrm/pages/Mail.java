package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mail {

	//account username
	@FindBy(id = "user-name")
	public WebElement userName;

	//Site Map Menu on the top left
	@FindBy(css = "#sitemap-menu")
	public WebElement dropdownMenuNextToLogo;

	// from yakup
	//------Dropdown menu elements when we click "dropdown Menu Next To Logo------
	//My Workspace from the "dropdown Menu Next To Logo"
	@FindBy(xpath = "//a[contains(text(), 'My Workspace')]")
	public WebElement myWorkspace;

}
