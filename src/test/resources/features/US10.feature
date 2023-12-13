Feature:US10 Kullanici coklu arama yapar



  Scenario Outline: TC15 Kullanici bir listedek elementleri aratabilmeli

    Given kullanici "toUrl" anasayfaya gider
    Then arama kutusuna "<aranacakKelimeler>" yazip Enter tusuna basar
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

    Examples:
    |aranacakKelimeler|
    |phone            |
    |java             |
    |nutella          |
    |samsung          |
    |apple            |