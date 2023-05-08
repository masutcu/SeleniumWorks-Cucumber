package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechProPage;

import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefinition {
    TechProPage techproPage;
    @Given("kullanici_techpro_sayfasina_gider")
    public void kullanici_techpro_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
    }

    @And("arama_kutusunda_QA_aratir")
    public void arama_kutusunda_qa_aratir() {
        techproPage=new TechProPage();
        techproPage.searchBox.sendKeys("qa", Keys.ENTER);
    }

    @And("sayfa_basliginin_qa_icerdigini_test_eder")
    public void sayfa_basliginin_qa_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("qa"));
    }

    @Then("cikan_reklam_kapatilir")
    public void cikan_reklam_kapatilir() {
        techproPage=new TechProPage();
        techproPage.reklam.click();
    }

    @Given("kullanici_{string}_sayfasina_gider")
    public void kullanici__sayfasina_gider(String url) {
        Driver.getDriver().get(url);
    }

    @And("kullanici_tum_sayfanin_resmini_alir")
    public void kullanici_tum_sayfanin_resmini_alir() {
        ReusableMethods.tumSayfaResmi("TumSayfaResmi");
    }


    @And("searchBoxda_{string}_aratir")
    public void searchboxda__aratir(String arananKelime) {
        techproPage=new TechProPage();
        techproPage.searchBox.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("sayfa_basliginin_{string}_icerdigini_test_eder")
    public void sayfa_basliginin__icerdigini_test_eder(String metin) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(metin));
    }
}