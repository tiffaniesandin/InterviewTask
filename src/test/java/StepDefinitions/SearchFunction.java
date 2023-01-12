package StepDefinitions;

import Pages.CartPage;
import Pages.HomePage;
import Pages.SearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class SearchFunction {

    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    CartPage cartPage = new CartPage();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        Assert.assertEquals("WebstaurantStore: Restaurant Supplies & Foodservice Equipment", Driver.getDriver().getTitle());
    }

    @Then("User enters {string} to search bar")
    public void user_enters_to_search_bar(String searchItem) {
        homePage.searchBar.sendKeys(searchItem+ Keys.ENTER);
    }
    @Then("User checks to make sure results show {string}")
    public void user_checks_to_make_sure_results_show(String keyword) {
        List<String> results = BrowserUtils.getElementsText(searchResultsPage.searchResultsTitle);
        int doesNotContainKeyword = 0;
        int containsKeyword = 0;
        for (int i = 0; i <= 8; i++) {
            {
                for (int j = 0; j < results.size(); j++) {
                    if (results.get(j).contains(keyword)) {
                        containsKeyword++;
                    }else {
                        doesNotContainKeyword++;
                    }
                }
                BrowserUtils.scrollDown(6000);
                if (i <= 7) {
                    searchResultsPage.rightSearchArrow.click();
                }
            }
        }
        System.out.println("Number of results showing table: "+ containsKeyword);
        System.out.println("Number of results not showing table: "+doesNotContainKeyword);
    }
    @Then("User adds last item in search to cart")
    public void user_adds_last_item_in_search_to_cart() {
      WebElement lastElement = searchResultsPage.addToCartButton.get(searchResultsPage.addToCartButton.size()-1);
      lastElement.click();
    }

    @Then("User empty's cart")
    public void user_empty_s_cart() {
        searchResultsPage.cartPopup.click();
        Assert.assertTrue(cartPage.cartHeader.isDisplayed());
        cartPage.emptyCartButton.click();
        cartPage.popupEmptyCartButton.click();
        Assert.assertTrue(cartPage.yourCartIsEmptyText.isDisplayed());
    }
}
