/**
 * 
 */
package com.kkl.test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.kkl.pages.EditorPage;
import com.kkl.pages.HomePage;
import com.kkl.pages.LoginPage;
import com.kkl.utils.ConfigProperties;

/**
 * @author paxa1887
 *
 */
public class EditorTest extends BasicTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	private HomePage homePage;
	private EditorPage editorPage;

	@Test
	public void testEditor() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(paxa1887);
		assertTrue(homePage.isLoggedIn());
		homePage.chooseProject();

	}

}
