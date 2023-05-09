package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class DataTableStepDefinition {

    DataTablePage dataTablePage;

    @Then("kullanici_sayfadaki_tabloda_new_butona_basar")
    public void  kullanici_sayfadaki_tabloda_new_butona_basar(){
        dataTablePage=new DataTablePage();
        dataTablePage.newButton.click();
        }


    @When("cıkan_pencerede_verilen_bilgileri_girelim {string},{string},{string},{string},{string},{string},{string}")
    public void cıkan_pencerede_verilen_bilgileri_girelim(String firstname, String lastname, String position, String ofis, String extention, String date, String salary) {
        dataTablePage=new DataTablePage();
        dataTablePage.firstName.sendKeys(firstname, Keys.TAB,lastname,Keys.TAB, position,
                Keys.TAB,ofis, Keys.TAB,extention,Keys.TAB, date,Keys.TAB, salary);


    }

    @And("kullanici_create_butonuna_basar")
    public void kullanici_create_butonuna_basar() {
        dataTablePage=new DataTablePage();
        dataTablePage.createButton.click();
    }


    @And("kullanici_search_bolumune_{string}_bilgisi_girer")
    public void kullanici_search_bolumune__bilgisi_girer(String firstname) {
        dataTablePage=new DataTablePage();
        dataTablePage.search.sendKeys(firstname);
    }

    @And("kullanıcı_{string}_ile_basarili_sekilde_giris_yaptıgını_dogrular")
    public void kullanıcı__ile_basarili_sekilde_giris_yaptıgını_dogrular(String firstname) {
        dataTablePage=new DataTablePage();
        Assert.assertTrue(dataTablePage.verify.getText().contains(firstname));


    }
}

