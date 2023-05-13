Feature: US001_Amazon_Sayfasinda_Urun_Aratma
  Scenario: TC01_Amazon_sayfasinda_Urun_Selenium_Aratma
    Given kullanici_amazon_sayfasina_gider
    And arama_kutusunda_"Selenium"_aratir
    And sayfayi_kapatir

  Scenario: TC02_Amazon_sayfasinda_Java_Aratma
    Given kullanici_amazon_sayfasina_gider
    And arama_kutusunda_"java"_aratir
    And sayfayi_kapatir


  Scenario: TC03_Amazon_sayfasinda_sql_Aratma
    Given kullanici_amazon_sayfasina_gider
    And arama_kutusunda_"sql"_aratir
    And sayfayi_kapatir