package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchResultsPage {

    @FindBy(xpath = "//a[@data-testid='itemDescription']")
    public List<WebElement> searchResultsTitle;
    @FindBy(xpath = "//a[@class='border-gray-400 hover:border-green-800 border-solid border border-r-0 box-border flex items-center justify-center font-semibold h-7-1/2 text-sm leading-none p-0 fill-current hover:text-white w-7-1/2 hover:shadow-inner-green bg-gray-gradient hover:bg-green-gradient rounded-r-md text-gray-800 border-r pagerLink']")
    public WebElement rightSearchArrow;
    @FindBy(name = "addToCartButton")
    public List<WebElement> addToCartButton;
    @FindBy(xpath = "//a[@class='btn btn-small btn-primary']")
    public WebElement cartPopup;


    public SearchResultsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
