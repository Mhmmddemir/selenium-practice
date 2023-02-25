package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TrendyolPage;
import utilities.Driver;

import java.time.Duration;

public class TrendyolStepdefiniitions {


     TrendyolPage trendyolPage=new TrendyolPage();

    @Given("User go to Trendyol homepage")
    public void user_go_to_trendyol_homepage() {

        Driver.getDriver().get("https://www.Trendyol.com");


        Driver.getDriver().switchTo().alert().accept();

        trendyolPage.trendyolGender.sendKeys();
    }
    @Then("write the I phone in Trendyol search box and make a search")
    public void write_the_i_phone_in_trendyol_search_box_and_make_a_search() {

        trendyolPage.trendyolSearchBox.sendKeys("iPhone"+ Keys.ENTER);

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Driver.getDriver().switchTo().alert().accept();

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
    @Then("tests that search results include iPhone")
    public void tests_that_search_results_include_i_phone() {

        Driver.getDriver().switchTo().alert().accept();

        String actualSearchResult =trendyolPage.trendyolSearchResult.getText();
        String expectedResult="iPhone";

        Assert.assertTrue(actualSearchResult.contains(expectedResult));



    }
    @Then("Close the page")
    public void close_the_page() {

        Driver.closeDriver();



    }

}
