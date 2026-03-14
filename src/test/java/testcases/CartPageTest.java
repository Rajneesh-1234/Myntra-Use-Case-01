package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;

public class CartPageTest extends BaseTest {
	private CartPage cart;

	@BeforeClass
	public void initCartPage() {
		cart = new CartPage(driver);
	}
	
	@Test(priority = 1)
	public void addToCartTest() {
		cart.addToCartProduct();
	}
	
	@Test(priority = 2)
	public void viewCartProductItemTest() {
		cart.viewCartProductItem();
	}
	
	@Test(priority = 3)
	public void clickproductQuantityTest() {
		cart.clickProductQuantity();
	}
	
	@Test(priority = 4)
	public void increaseProductQuantity() {
		cart.increaseProductQuantity();
	}
}
