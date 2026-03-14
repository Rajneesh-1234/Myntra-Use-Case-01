package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SearchResultsPage;

public class SearchResultsPageTest extends BaseTest{

	private SearchResultsPage searchResult;
	@BeforeClass
	public void initSearchResult() {
		searchResult = new SearchResultsPage(driver);
	}
  @Test(priority = 1)
  public void captureAndDisplayUnitPriceTest() {
    searchResult.captureAndDisplayUnitPrice();
  }

  @Test(priority = 2)
  public void getQuantityValueTest() {
    searchResult.getQuantityValue();
  }

  @Test(priority = 3)
  public void verifyTotalPriceTest() {
    searchResult.verifyTotalPrice();
  }
}
