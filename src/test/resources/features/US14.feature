Feature:US14 Arama sonucu bulunup sepete eklenen urun ismi ile sepetteki urun ayni isme sahip olmali


  Scenario:TC20 Kullanici urun aratip urunu sepete ekledikten sonra sepetteki urun ismi ayni oldugunu dogrulamali


    Given "toUrl" anasayfaya gidin
    And  arama kutusuna phone yazip ENTER tusuna basin
    Then Listelenen sonuclardan ilkini tiklayin
    Then urunu sepete ekleyin
    Then your cart linkine tiklayin
    Then sepetteki urun isminin case sensitive olmadan iphone icerdigini test edin
    Then sayfayi kapatin