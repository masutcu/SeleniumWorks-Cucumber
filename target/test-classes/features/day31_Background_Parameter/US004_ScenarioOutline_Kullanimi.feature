Feature: Google_Search
  Background: Kullanici_Google_Anasayfasina_Gider
    Given kullanici_"https://google.com"_sayfasina_gider
    #ScenarioOutline TestNg Deki @dataprovider mantığı ile çalışır.
    # Birden fazla veriyi tek seferde featurefile dan kullanırız.
    Scenario Outline: Google_Aramalari
      Then kullanici googleda "<aranacakKelime>" aratir
      Then basligin "<aranacakKelime>" icerdigini dogrular
      Then sayfayi_kapatir
      Examples:
        | aranacakKelime |
        | bmw            |
        | mercedes       |
        | audi           |
        | ford           |
        | toyota         |
        | honda          |