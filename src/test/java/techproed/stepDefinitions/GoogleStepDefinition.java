package techproed.stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class GoogleStepDefinition {
    GooglePage googlePage;
    @Then("kullanici googleda {string} aratir")
    public void kullaniciGoogledaAratir(String aranan) {
        googlePage=new GooglePage();
        googlePage.searchBox.sendKeys(aranan, Keys.ENTER);


    }

    @Then("basligin {string} icerdigini dogrular")
    public void basliginIcerdiginiDogrular(String baslıktaAranan) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslıktaAranan));
    }
}
