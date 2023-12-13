Feature:US8 kullanici arama sonucu video bulur

  Scenario:TC kullanici arama kutusuna metin girip video aratir

    Given kullanici "youtubeUrl" anasayfaya gider
    Then youtube arama kutusuna "zorunda miyim" yazip Enter tusuna basar
    And youtube'da arama sonucunda video bulunabildigini test eder
    And sayfayi kapatir