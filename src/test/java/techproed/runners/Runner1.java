package techproed.runners;

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
@CucumberOptions(plugin = {
        "pretty", // consolu renkli yazdirir
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:target/failed_scenarios.txt",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},
        features = "src/test/resources/features",
        glue ={"techproed/stepDefinitions"},//Bu parametre ile kodlarımızı yazdığımız step definition class ının package ını belirtiriz.
        tags ="@ilk",
        dryRun = false,
        monochrome = true)


public class Runner1 {

}
