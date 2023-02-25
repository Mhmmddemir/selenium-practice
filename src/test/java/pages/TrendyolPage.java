package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {

public TrendyolPage(){

    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "(//input[@type='text'])[1]")

    public WebElement trendyolSearchBox;

@FindBy(xpath = "//div[@class='srch-ttl-cntnr-wrppr']")

    public WebElement trendyolSearchResult;

@FindBy(xpath = "(//span[@class='homepage-popup-gender'])[1]")

    public WebElement trendyolGender;

}
