Feature: US002_Parallel_Test
  @techpro3
  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Given kullanici_"techproed_Url"_sayfasina_gider
    Then cikan_reklam_kapatilir
    When kullanici 2 saniye bekler
    And searchBoxda_"python"_aratir