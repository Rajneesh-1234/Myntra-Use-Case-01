package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import pages.HomePage;

public class HomePageTest extends BaseTest {
	private HomePage home;

	@BeforeClass
	public void initPage() {
		home = new HomePage(DriverFactory.getDriver());
	}

	@Test(priority = 1)
	public void searchProductTest() {
		String productName = "Women's Sneakers";
		home.searchProduct(productName);
	}

	@Test(priority = 2)
	public void isHomePageDisplayedTest() {
		boolean isHomePageVisible = home.isHomePageDisplayed();
		Assert.assertTrue(isHomePageVisible, "Home page is not displayed");
	}

}
