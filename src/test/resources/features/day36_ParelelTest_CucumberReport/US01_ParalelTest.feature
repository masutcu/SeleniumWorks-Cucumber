Feature: US001_Parallel_Test
  @techpro1
  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Given kullanici_"techproed_Url"_sayfasina_gider
    Then cikan_reklam_kapatilir
    When kullanici 2 saniye bekler
    And searchBoxda_"qa"_aratir

  @techpro2
  Scenario: TC02_TechProEducation_Sayfasi_Testi
    Given kullanici_"techproed_Url"_sayfasina_gider
    Then cikan_reklam_kapatilir
    When kullanici 2 saniye bekler
    And searchBoxda_"developer"_aratir
