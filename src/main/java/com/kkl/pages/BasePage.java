/**
 * 
 */
package com.kkl.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author paxa1887
 *
 */
public abstract class BasePage {

	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	protected void type(WebElement webElement, String text) {
		webElement.clear();
		webElement.sendKeys(text);

	}

	public abstract void open();

	public boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	protected void WaitRenderElement(WebElement element) throws InterruptedException {
		while (!element.isDisplayed()) {

			Thread.sleep(5000);

		}

	}

	protected void WaitBecomesClickable() throws InterruptedException {
		Thread.sleep(5000);
	}

	protected void ChangeWindow(WebElement element) {
		driver.switchTo().frame(element);
	}

	protected void WaitReport() throws InterruptedException {
		Thread.sleep(120000);
	}

}
