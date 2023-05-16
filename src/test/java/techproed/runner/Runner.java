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
    @CucumberOptions(plugin = {"pretty","html:src/test/resources/features/htmlReport/cucumberHooks.html",//konsolda senaryolar ile ilgili bilgi yazdırılır
                                        "json:src/test/resources/features/htmlReport/cucumber.json",
                                        "junit:src/test/resources/features/htmlReport/cucumber.xml",
                                        "rerun:TestOutput/filed_scenario.txt"},//testng deki listeners retry gibi fail olan senaryoları
                                                                                //belirtilen yoldaki .txt  dosyada gösterir

                    features = "src/test/resources/features",
                    glue ={"techproed/stepDefinitions"},//Bu parametre ile kodlarımızı yazdığımız step definition class ının package ını belirtiriz.
                    tags ="@rerun",
                    dryRun = false,
                    monochrome = false)//pretty ifadesinden sonra monocrome true kullanırsak
                                        // senaryo adımları konsolda  siyah gösterilir. default "false" renkli
    // dryRun default olarak false'dur.
    // true dersek testlerimizi gercekte calistirmaz
    // sadece calistiriyormus gibi kontrol eder.
    // ornegin true'da sayfaya gitmez.
    // false yaparsak driver acilir ve sayfaya gider

    //        features ===> features'ların olduğu package yolunu ver(ContentRoot)
    //        glue ====> stepDefinition'ların olduğu package yolunu ver(Source Root)
    //        tags ====> çalıştırmak istediğin grubu yaz
    //        dryRun  = true

    public class Runner {
}
