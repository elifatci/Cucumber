Feature: US1 Kullanici testotomasyonu sayfasinda arama yapar

  Scenario: TC01_ Kullanici phone aramasinda sonuc bulmalidir

    Given kullanici testotomasyonu anasayfaya gider
    Then arama kutusuna phone yazip ENTER tusuna basar
    And arama sonucunda urun bulunabildigini test eder
    And biraz bekler
    Then sayfayi kapatir

@Regression @Smoke @E2E1
    Scenario: TC02 Kullanici shoes icin sonuc bulmali
      Given kullanici testotomasyonu anasayfaya gider
      Then arama kutusuna shoes yazip ENTER tusuna basar
      And arama sonucunda urun bulunabildigini test eder
      Then sayfayi kapatir


      Scenario: TC03 Kullanici nutella arattiginda sonuc bulamamali
        Given kullanici testotomasyonu anasayfaya gider
        Then arama kutusuna nutella yazip Enter tusuna basar
        And arama sonucunda urun bulunamadigini test eder
        And biraz bekler
        Then sayfayi kapatir

        Scenario: TC04 Kullanici java arattiginda sonuc bulamamali
          Given kullanici testotomasyonu anasayfaya gider
          Then arama kutusuna "java" yazip Enter tusuna basar
          And arama sonucunda urun bulunamadigini test eder
          And biraz bekler
          Then sayfayi kapatir