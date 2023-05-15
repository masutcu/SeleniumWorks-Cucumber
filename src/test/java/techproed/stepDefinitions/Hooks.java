package techproed.stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Hooks {
    /*
     Scenario'lar arasındaki bağlantıyı sağlayan glue parametresine koyduğumuz stepDefiniton package'ı içerisinde
    @Before ve @After gibi bir notasyon varsa extends yapmamıza gerek kalmadan her scenario'dan önce veya sonra bu
    methodlar çalışacaktır.
     Cucumber'da @Before, @After kullanma ihtiyacımız olursa bunu Hooks class'ına koyarız.
    İstersek yeni bir package oluşturup bunun içinede Hooks class'ını koyabiliriz. Eğer yeni bir package içerisine
koyarsak Runner class'ındaki glue parametresine bu package'ı da eklememiz gerekir
    DİKKAT: Kullandığımız @Before @After notasyonları Junit den değil Cucumberdan olmalıdır.

     */
    @Before  ("@All")//importu cucumber olmalıdır.
    public void setUp1() {
        System.out.println("Testler çalışmaya başladı");
    }
    @Before  ("@gr1")
    public void setUp2() {
        System.out.println("Amazonda sql aratıldı");
    }
    @Before ("@gr2")
    public void setUp3() {
        System.out.println("Amazonda java aratıldı");
    }
    @Before ("@gr3")
    public void setUp4() {
        System.out.println("amazonda selenium aratıldı");
    }
    @After //import io.cucumber.java.After olmalıdır
    public void tearDown(Scenario scenario) { //Bu metoda bir Scenario clasından bir parametre ataması yapılır
        //Bu method da fail olan scenario larımızın resmini alacağız
        if (scenario.isFailed()){
            TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg","screenshot_"+scenario.getName());
        }
        Driver.closeDriver();
    }

}
