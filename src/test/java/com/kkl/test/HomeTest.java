/**
 * 
 */
package com.kkl.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.kkl.pages.HomePage;
import com.kkl.pages.LoginPage;

/**
 * @author paxa1887
 *
 */
public class HomeTest extends BasicTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	private HomePage homePage;

	@Test
	public void testEditor() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(paxa1887);
		assertTrue(homePage.isLoggedIn());
		homePage.chooseProject();

	}

}
