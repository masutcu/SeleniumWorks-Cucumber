package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage;
    @Given("kullanici_amazon_sayfasina_gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
       }

    @Given("arama_kutusunda_iphone_aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);


    }
    @Given("sayfayi_kapatir")
    public void sayfayi_kapatir() {
    Driver.closeDriver();

    }

    @And("arama_kutusunda_Selenium_aratir")
    public void arama_kutusunda_selenium_aratir() {
        amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }

    @And("arama_kutusunda_Java_aratir")
    public void arama_kutusunda_java_aratir() {
        amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Java", Keys.ENTER);

    }

    @And("arama_kutusunda_sql_aratir")
    public void arama_kutusunda_sql_aratir() {
        amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("sql", Keys.ENTER);
    }
}
