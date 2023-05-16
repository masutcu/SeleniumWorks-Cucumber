Feature: BlueRentelCar Excel login testi
  Scenario: TC01_Positive_Login_Testi
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    And kullanici_exceldeki_"customer_info"_sayfasindaki_kullanici_bilgileri_ile_login_olur