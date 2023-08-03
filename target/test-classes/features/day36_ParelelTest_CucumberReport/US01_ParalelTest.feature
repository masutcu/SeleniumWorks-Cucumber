Feature: US001_Parallel_Test
  @techpro1
  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Given kullanici_"techproed_Url"_sayfasina_gider
    Then cikan_reklam_kapatilir
    When kullanici 1 saniye beklergi
    And searchBoxda_"dell"_aratir

  @techpro2
  Scenario: TC02_TechProEducation_Sayfasi_Testi
    Given kullanici_"techproed_Url"_sayfasina_gider
    Then cikan_reklam_kapatilir
    When kullanici 6 saniye bekler
    And searchBoxda_"developer"_aratir
