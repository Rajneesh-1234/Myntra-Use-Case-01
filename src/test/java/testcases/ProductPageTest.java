package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import pages.ProductPage;

public class ProductPageTest extends BaseTest{
	private ProductPage product;

	@BeforeClass
	public void initPage() {
		product = new ProductPage(DriverFactory.getDriver());
	}
	 @Test(priority = 1)
	    public void selectProductAndClickTest() {
	        product.selectProductAndClick();
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("myntra"),
	                "Product detail page did not open");
	    }
}
