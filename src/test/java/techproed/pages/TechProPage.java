package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechProPage {
    public TechProPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@class='eicon-close']" )
    public WebElement reklam;

    @FindBy(xpath ="//*[@type='search']" )
    public WebElement searchBox;
}
