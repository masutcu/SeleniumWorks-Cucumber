package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {

    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;

    @FindBy(id = "formBasicEmail")
    public WebElement emailBox;

    @FindBy(id = "formBasicPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.=' Login']")
    public WebElement loginConfirm;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userDropDown;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement OK;
}
