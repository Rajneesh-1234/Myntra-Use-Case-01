package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import utils.WaitUtils;

public class ProductPage extends BasePage {
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = "li.product-base")
	private List<WebElement> productList;

	public void selectProductAndClick() {
		WaitUtils.waitForElementToBeVisible(productList.get(0));
		if (productList == null || productList.size() == 0) {
			throw new RuntimeException("No products found on search results page");
		}
		WebElement firstProduct = productList.get(0);
		firstProduct.click();
		System.out.println(firstProduct.getText());
	}
}
