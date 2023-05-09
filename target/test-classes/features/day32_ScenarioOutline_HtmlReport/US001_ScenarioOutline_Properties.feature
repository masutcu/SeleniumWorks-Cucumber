Feature: Google_Search
  Background: Kullanici_Google_Anasayfasina_Gider
    Given kullanici_"googleUrl"_sayfasina_gider

  Scenario Outline: Google_Aramalari
    Then kullanici googleda "<aranacakKelime>" aratacaktir
    Then basligin "<aranacakKelime>" icerdigini dogrular
    Then sayfayi_kapatir
    Examples:
      | aranacakKelime |
      | arac1          |
      | arac2          |
      | arac3          |
      | arac4          |
      | arac5          |
      | arac6          |