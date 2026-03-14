package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SearchResultsPage extends BasePage{
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]")
	private WebElement unitPrice;
	public void captureAndDisplayUnitPrice() {
		String price=unitPrice.getText();
		System.out.println("Unit Price: "+price);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Qty')]")
	private WebElement quantityElement;
	public int getQuantityValue() {
	    String qtyText = quantityElement.getText(); 
	    String numberOnly = qtyText.replaceAll("[^0-9]", "");
	    int quantity = Integer.parseInt(numberOnly);
	    System.out.println("Quantity: " + quantity);
	    return quantity;
	}
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[5]/span[2]/span[2]")
	private WebElement totalPrice;
	public void verifyTotalPrice() {
	    String unitPriceText = unitPrice.getText();
	    String cleanUnitPrice = unitPriceText.replaceAll("[^0-9]", "");
	    int unitPriceValue = Integer.parseInt(cleanUnitPrice);
	    System.out.println("Unit Price: " + unitPriceValue);
	    int quantity = getQuantityValue();
	    String totalPriceText = totalPrice.getText();
	    String cleanTotalPrice = totalPriceText.replaceAll("[^0-9]", "");
	    int totalPriceValue = Integer.parseInt(cleanTotalPrice);
	    System.out.println("Displayed Total Price: " + totalPriceValue);
	    int expectedTotalPrice = unitPriceValue * quantity;
	    System.out.println("Expected Total Price: " + expectedTotalPrice);
	    if(expectedTotalPrice == totalPriceValue) {
	        System.out.println("Price Validation PASSED");
	    } else {
	        System.out.println("Price Validation FAILED");
	        System.out.println("Mismatch Found!");
	    }

	}
}
