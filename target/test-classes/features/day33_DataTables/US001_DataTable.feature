Feature: US001_Amazonda_Urun_Aratma
  Scenario: TC01_Amazonda_Urun_Aratma
    Given kullanici_amazon_sayfasina_gider
    And kullanici_verilen_ürünleri_aratır
      | Urunler  |
      | samsung  |
      | nokia    |
      | iphone   |
      | motorola |
      | oppo     |
    And sayfayi_kapatir

    #DataTable scenario lardaki satır ve sutun için bir veri tablosu temsil eder
    #Bunun için kullanılmak istenen her stepden sonra yukardaki örnekteki gibi bir tablo yapısı oluştururuz.
    #Ve bu stepin methodunu stepdefinition da oluşturduğumuz zaman burdaki verileri alabilmemiz için
    #oluşturulan methoda DataTable parametresi eklenir. Bu parametre ismi ile bir list oluşturulabilir.
    #yada direk aslist() methodu ile row lara ulaşabiliriz