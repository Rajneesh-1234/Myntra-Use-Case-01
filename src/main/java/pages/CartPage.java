package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[text()='ADD TO BAG']")
	private WebElement addTOCart;
	
	public void addToCartProduct() {
		addTOCart.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Bag']")
	private WebElement viewCartProduct;
	
	public void viewCartProductItem() {
		viewCartProduct.click();
	}
	
	@FindBy(xpath = "//div[contains(@class,'itemComponents-base-quantity')]")
	private WebElement productQuantity;
	public void clickProductQuantity() {
		productQuantity.click();
	}
	
	@FindBy(xpath = "//div[@id='10']")
	private WebElement increaseQuantity;
	
	@FindBy(xpath = "//div[normalize-space()='DONE']")
	private WebElement doneButton;
	
	public void increaseProductQuantity() {
		increaseQuantity.click();
		doneButton.click();
	}

}
