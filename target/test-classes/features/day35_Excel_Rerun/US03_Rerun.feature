@rerun
Feature: US003 Amazon Testi

  Scenario: TC01 Amazonda_ürün_aratma
    Given kullanici_"amazon_url"_sayfasina_gider
    And arama_kutusunda_iphone_aratir
    And basligin "iphone" icerdigini dogrular  //fail verecek locate yanlış

    Scenario: TC02 Amazonda_ürün_aratma
      Given kullanici_"amazon_url"_sayfasina_gider
      And arama_kutusunda_"samsung"_aratir
      And basligin "samsung" icerdigini dogrular

  Scenario: TC03 Amazonda_ürün_aratma
    Given kullanici_"amazon_url"_sayfasina_gider
    And arama_kutusunda_"nokia"_aratir
    And basligin "samsung" icerdigini dogrular  //fail  verecek

  Scenario: TC04 Amazonda_ürün_aratma
    Given kullanici_"amazon_url"_sayfasina_gider
    And arama_kutusunda_"motorola"_aratir
    And basligin "samsung" icerdigini dogrular  //fail  verecek

  Scenario: TC05 Amazonda_ürün_aratma
    Given kullanici_"amazon_url"_sayfasina_gider
    And arama_kutusunda_"apple"_aratir
    And basligin "apple" icerdigini dogrular