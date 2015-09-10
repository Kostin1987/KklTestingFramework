/**
 * 
 */
package com.kkl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author paxa1887
 *
 */
public class HomePage extends Page {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "logout-dropdown")
	public WebElement dropLogOut;

	@FindBy(css = "a[href*='login']")
	public WebElement linkLogIn;

	@FindBy(linkText = "Log Out")
	public WebElement linkLogOut;

	@FindBy(linkText = "Test")
	public WebElement linkTest;

	@FindBy(linkText = "EDITOR")
	public WebElement linkEditor;

	@FindBy(linkText = "ANALYZER")
	public WebElement linkAnalyzer;

	@FindBy(linkText = "REPORT EDITOR")
	public WebElement linkReportEditor;

	@Override
	public void open() {

	}

	public boolean isLoggedOut() {

		return isElementPresent(linkLogIn);

	}

	public boolean isLoggedIn() {
		return isElementPresent(dropLogOut);
	}

	public void logout() {
		dropLogOut.click();
		linkLogOut.click();
	}

	public EditorPage chooseProject() {
		linkTest.click();
		return PageFactory.initElements(driver, EditorPage.class);
	}

	public void chooseLinks() {
		linkEditor.click();
		linkAnalyzer.click();
		linkReportEditor.click();
	}
}
