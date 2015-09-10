/**
 * 
 */
package com.kkl.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import com.kkl.data.UserData;
import com.kkl.utils.ConfigProperties;

/**
 * @author paxa1887
 *
 */
public class BasicTestCase {

	protected static WebDriver driver;

	public UserData paxa1887 = new UserData(ConfigProperties.getProperty("user"),
			ConfigProperties.getProperty("password"));

	protected WebDriver getWebDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")),
					TimeUnit.SECONDS);
		}
		return driver;
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}
