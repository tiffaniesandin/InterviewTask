package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import utilities.Driver;

public class HomePage {

    @FindBy(id = "searchval")
    public WebElement searchBar;


public HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
}
