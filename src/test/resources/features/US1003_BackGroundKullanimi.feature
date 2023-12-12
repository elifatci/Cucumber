Feature: US1003 Kullanici bastaki ortak adimlari tek sefer yazabilmeli

  Background: baslangictaki ortak adimlar buraya yazilabilir
    Given kullanici "toUrl" anasayfaya gider



@ilk
  Scenario: TC06 Kullanici java arattiginda sonuc bulamamali

    Then arama kutusuna "java" yazip Enter tusuna basar
    And arama sonucunda urun bulunamadigini test eder
    And 2 saniye bekler
    Then sayfayi kapatir

  Scenario: TC07 Kullanici cucumber arattiginda sonuc bulamamali

    Then arama kutusuna "cucumber" yazip Enter tusuna basar
    And arama sonucunda urun bulunamadigini test eder
    And 2 saniye bekler
    Then sayfayi kapatir