Feature: US003_TechProEducation_Testi
  Background: Kullanici TechproEducation Sayfasina Gider
    Given kullanici_"https://techproeducation.com"_sayfasina_gider
    #https://techproeducation.com yerine .properties dosyasındaki key de kullanılabilir.
    # Eğer properties dosyasındaki key olarak email veya adress kullanmak istersek stepdefinition
    # class ımızda parametre ile ggiriş yapmalıyız
  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Then cikan_reklam_kapatilir
    When kullanici 2 saniye bekler
    And kullanici_tum_sayfanin_resmini_alir
    And arama_kutusunda_QA_aratir
    Then kullanici 2 saniye bekler
    And sayfa_basliginin_qa_icerdigini_test_eder
    When kullanici_tum_sayfanin_resmini_alir
    And sayfayi_kapatir

  Scenario: TC02_TechProEducation_Sayfasi_Testi
    And cikan_reklam_kapatilir
    And kullanici 2 saniye bekler
    And searchBoxda_"developer"_aratir
    And sayfa_basliginin_"developer"_icerdigini_test_eder
    When kullanici_tum_sayfanin_resmini_alir
    And sayfayi_kapatir