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
    @CucumberOptions(features = "src/test/resources/features/day30_ilkFeature",
                    glue ={"techproed/stepDefinitions"},//Bu parametre ile kodlarımızı yazdığımız step definition class ının package ını belirtiriz.
                    tags ="@gr1 or @sql") //bu şekilde 3 üde çalışır and olsa ikisi bir olanı çalıştırır.
    //        features ===> features'ların olduğu package yolunu ver(ContentRoot)
    //        glue ====> stepDefinition'ların olduğu package yolunu ver(Source Root)
    //        tags ====> çalıştırmak istediğin grubu yaz
       public class Runner {
}
