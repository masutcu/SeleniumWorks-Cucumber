package techproed.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Runner class; testNG'deki .xml file'larda belirttiğimiz class'ları, package'ları veya methodları nasıl
çalıştırıyorsak, Cucumber frameworkunde de Runner class'ındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz.
 */

@RunWith(Cucumber.class)//Cucumber ile Junit in entegre olmasını sağlayan test çalıştırıcı notasyon
//seneryaların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile ilgili seçenekleri ayarlar
@CucumberOptions(plugin = {"pretty","html:src/test/resources/features/htmlReport/cucumberHooks.html",
        "json:src/test/resources/features/htmlReport/cucumber.json",
        "junit:src/test/resources/features/htmlReport/cucumber.xml",
        "rerun:TestOutput/filed_scenario.txt"},//testng deki listeners retry gibi fail olan senaryoları
        //belirtilen yoldaki .txt  dosyada gösterir
        features = "@TestOutput/filed_scenario.txt",
        glue ={"techproed/stepDefinitions"},
        //direk adresten aldığı için tag ı yazmadık
        dryRun = false,
        monochrome = true)
/*
    rerun plugin kullanımında plugin parametresinin içine txt dosyamısın yolunu belirtiriz.
 feature parametresinin içinede aynı yolu kopyalarız ve başına @ işareti koymalıyız.
 feature parametresi ile direk dosyayı gördüğü için bu class'da tags parametresine gerek yoktur.
 Böylelikle fail olan senaryolarımızın ismi ve satır numarası txt dosyamızın içine kaydedilir.
 Ve FailedRun class'ından run yaptığımız zaman txt dosyamızın içindeki fail olan scenariyolar
 tekrar çalışacaktır. Fail olan scenariyolarımızdaki hata düzeltildikten sonra txt dosyasının
 içindeki bilgiler silinir.

 */

public class FailedRun {

}
