package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import utilities.Driver;

public class CartPage {

    @FindBy(xpath = "//h1[.='Cart']")
    public WebElement cartHeader;
    @FindBy(xpath = "//button[@class='emptyCartButton btn btn-mini btn-ui pull-right']")
    public WebElement emptyCartButton;
    @FindBy(xpath = "//button[@class='bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 mr-2 rounded-normal text-base leading-normal px-7 py-2-1/2 hover:bg-green-600 text-white text-shadow-black-60 bg-green-primary bg-linear-gradient-180-green border-black-25 shadow-inset-black-17 align-middle font-semibold']")
    public WebElement popupEmptyCartButton;
    @FindBy(xpath = "//p[.='Your cart is empty.']")
    public WebElement yourCartIsEmptyText;


    public CartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
