Feature: US002_Amazon_Sayfasında_Urun_Aratma
  #claslarımızda kullandığımız @Before gibi burda da her scenario önce Background: yapısı çalışır
  Background: Kullanici_Amozon_Sayfasina_Gider
    Given kullanici_amazon_sayfasina_gider
  # feature file da birden fazla ürün aratmak için her ürün için yeni bir ethod oluşturmak gerekir.
  # dolayısıyla step definition class ında çok fazla method oluşturmuş oluruz.
  # Tek bir parametreli method oluşturup bunun üstsinden gelebiliriz.Scenario.
  # Bunu için featuree file da aratmak istediğim metni " "  içine yazarsak stepdefinition
  # classında bize parametreli olarak oluşturur. Böylece bu methodu kullanarak istediğimiz kadar
  # metin aratabiliriz.
  Scenario: TC01_Amazon_Sayfasinda_selenium_aratma
    Then arama_kutusunda_"Selenium"_aratir
    And kullanici 3 saniye bekler

  Scenario: TC02_Amazon_Sayfasinda_GitHub_aratma
    Then arama_kutusunda_"GitHub"_aratir
    Then kullanici 3 saniye bekler

  Scenario: TC03_Amazon_Sayfasinda_Samsung_aratma
    And arama_kutusunda_"Samsung"_aratir
    And kullanici_tüm_sayfanın_resmini_alir

  Scenario: TC04_Amazon_Sayfasinda_Nokia_aratma
    Then arama_kutusunda_"nokia"_aratir



