Feature: US001_Amazon_Sayfasında_Urun_Aratma
  #claslarımızda kullandığımız @Before gibi burda da her scenario önce Background: yapısı çalışır
  Background: Kullanici_Amozon_Sayfasina_Gider
    Given kullanici_amazon_sayfasina_gider

    Scenario: TC01_Amazon_Sayfasinda_selenium_aratma
      Then arama_kutusunda_Selenium_aratir
      And sayfayi_kapatir

    Scenario: TC02_Amazon_Sayfasinda_java_aratma
      When arama_kutusunda_Java_aratir
      And sayfayi_kapatir

    Scenario: TC03_Amazon_Sayfasinda_sql_aratma
      And arama_kutusunda_sql_aratir
      And sayfayi_kapatir
