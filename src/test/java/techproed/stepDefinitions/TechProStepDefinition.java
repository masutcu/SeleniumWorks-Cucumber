package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechProPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TechProStepDefinition {
    TechProPage techProPage;
    @Given("kullanici_techpro_sayfasina_gider")
    public void kullanici_techpro_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
    }

    @And("arama_kutusunda_QA_aratir")
    public void arama_kutusunda_qa_aratir() {
        techProPage=new TechProPage();
        techProPage.reklam.click();
        techProPage.searchBox.sendKeys("qa", Keys.ENTER);


    }

    @And("arama_basliginda_qa_varmi")
    public void arama_basliginda_qa_varmi() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("qa"));
    }
}
