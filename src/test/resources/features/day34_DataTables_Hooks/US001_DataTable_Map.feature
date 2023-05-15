Feature: US002 BlueRentelCar Login Islemi Map

  Scenario: TC01_BlueRentelCar_Positive_Test
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    Then Verilen_kullanicilar_ile_login_olur
      | emailAdress                   | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
    And sayfayi_kapatir


