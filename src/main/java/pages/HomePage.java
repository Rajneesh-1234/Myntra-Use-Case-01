package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import utils.WaitUtils;

/*
 * HomePage class represents Myntra Home Page.
 * This class contains page elements and actions related to
 * product searching functionality.
 */
public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement searchInputBox;

	@FindBy(xpath = "//a[@class='desktop-submit']")
	private WebElement searchButton;

	@FindBy(css = "a.desktop-logo")
	private WebElement myntraLogo;

	public void enterProductInSearchBox(String productName) {
		WaitUtils.waitForElementToBeVisible(searchInputBox);
		searchInputBox.clear();
		searchInputBox.sendKeys(productName);
	}

	public void clickSearchButton() {
		WaitUtils.waitForElementToBeClickable(searchButton);
		searchButton.click();
	}

	public void searchProduct(String productName) {
		enterProductInSearchBox(productName);
		clickSearchButton();
	}

	public void searchProductUsingEnter(String productName) {
		WaitUtils.waitForElementToBeVisible(searchInputBox);
		searchInputBox.clear();
		searchInputBox.sendKeys(productName);
		searchInputBox.sendKeys(Keys.ENTER);
	}

	public boolean isHomePageDisplayed() {
		WaitUtils.waitForElementToBeVisible(myntraLogo);
		return myntraLogo.isDisplayed();
	}

	
}
