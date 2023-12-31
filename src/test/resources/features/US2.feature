Feature: US2 Kullanici parametre ile verdigi urunu aratabilmeli

  Scenario: TC04 Kullanici java arattiginda sonuc bulamamali
    Given kullanici testotomasyonu anasayfaya gider
    Then arama kutusuna "java" yazip Enter tusuna basar
    And arama sonucunda urun bulunamadigini test eder
    And 2 saniye bekler
    Then sayfayi kapatir

  Scenario: TC05 Kullanici cucumber arattiginda sonuc bulamamali
    Given kullanici "toUrl" anasayfaya gider
    Then arama kutusuna "cucumber" yazip Enter tusuna basar
    And arama sonucunda urun bulunamadigini test eder
    And 2 saniye bekler
    Then sayfayi kapatir