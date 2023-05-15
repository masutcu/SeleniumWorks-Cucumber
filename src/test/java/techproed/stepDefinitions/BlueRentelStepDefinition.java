package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.Map;

public class BlueRentelStepDefinition {

    BlueRentalPage blueRentalPage=new BlueRentalPage();

    @Then("Verilen_kullanici_ile_login_olur")
    public void verilen_kullanici_ile_login_olur(DataTable data) {
        blueRentalPage=new BlueRentalPage();
        blueRentalPage.loginButton.click();
        ReusableMethods.bekle(2);
        blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB,data.row(1).get(1),Keys.ENTER);
        ReusableMethods.bekle(3);
        Assert.assertEquals(blueRentalPage.userDropDown.getText(),"Sam Walker");
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(3);
        blueRentalPage.emailBox.sendKeys(data.row(2).get(0), Keys.TAB,data.row(2).get(1),Keys.ENTER);
        ReusableMethods.bekle(3);
        Assert.assertEquals(blueRentalPage.userDropDown.getText(),"Kate Brown");


    }

    @Then("Verilen_kullanicilar_ile_login_olur")
    public void verilen_kullanicilar_ile_login_olur(DataTable data) {
        System.out.println("data.asMaps() = " + data.asMaps());
        //Maplerden oluşan bir list oluşturur.
        // Feature file da oluşturulan tabloyu map olarak listeler.
        // Başlığı Key olarak alır. Altındaki verileri value olarak alır.
        for (Map<String,String> w:data.asMaps()){
            blueRentalPage.loginButton.click();
            blueRentalPage.emailBox.sendKeys(w.get("emailAdress"),Keys.TAB,w.get("password"),Keys.ENTER);
            ReusableMethods.bekle(2);
            blueRentalPage.userDropDown.click();
            ReusableMethods.bekle(2);
            blueRentalPage.logOut.click();
            ReusableMethods.bekle(2);
            blueRentalPage.OK.click();
        }

    }
}
