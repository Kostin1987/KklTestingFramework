/**
 * 
 */
package com.kkl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kkl.data.UserData;
import com.kkl.utils.ConfigProperties;

/**
 * @author paxa1887
 *
 */
public class LoginPage extends BasePage {

	@FindBy(id = "username")
	public WebElement fieldUserName;

	@FindBy(id = "password")
	public WebElement fieldPassword;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement buttonLogin;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public HomePage loginAs(UserData admin) throws InterruptedException {
		WaitRenderElement(fieldUserName);
		type(fieldUserName, admin.name);
		
		WaitRenderElement(fieldPassword);
		type(fieldPassword, admin.password);
		
		WaitRenderElement(buttonLogin);
		buttonLogin.click();
		return PageFactory.initElements(driver, HomePage.class);

	}

	@Override
	public void open() {
		driver.get(ConfigProperties.getProperty("login.url"));
	}

}
