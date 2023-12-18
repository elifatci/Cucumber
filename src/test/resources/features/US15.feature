Feature: Kullanici yanlis bilgilerle sisteme giris yapamaz


  @wip
  Scenario: TC21 Kullanici gecerli mail gecersiz sifre ile giris yapamamali


    Given  kullanici "toUrl" anasayfaya gider
    And  login account linkine tiklar
    Then Mail kutusuna gecerli mail girer
    Then Sifre kutusuna gecersiz sifre girer
    Then login tusuna basar
    Then Basarili bir sekilde giris yapilamadigini test eder
    Then sayfayi kapatir

  @wip
  Scenario: TC22 Kullanici gecersiz mail gecerli sifre ile giris yapamamali
    Given  kullanici "toUrl" anasayfaya gider
    And  login account linkine tiklar
    Then Mail kutusuna gecersiz mail girer
    Then Sifre kutusuna gecerli sifre girer
    Then login tusuna basar
    Then Basarili bir sekilde giris yapilamadigini test eder
    Then sayfayi kapatir

  @wip
  Scenario: TC23 Kullanici gecersiz mail gecersiz sifre ile giris yapamamali
    Given  kullanici "toUrl" anasayfaya gider
    And  login account linkine tiklar
    Then Mail kutusuna gecersiz mail girer
    Then Sifre kutusuna gecersiz sifre girer
    Then login tusuna basar
    Then Basarili bir sekilde giris yapilamadigini test eder
    Then sayfayi kapatir