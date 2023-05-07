Feature: US001_Amazon_Sayfası_Testi
  Scenario: TC01_Amazon_Sayfasında_Urun_Aratılır
    Given kullanici_amazon_sayfasina_gider
    And arama_kutusunda_iphone_aratir
    And sayfayi_kapatir
