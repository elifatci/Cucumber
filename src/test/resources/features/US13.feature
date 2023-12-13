Feature: Kullanici BestBuyAssertions anasayfasinda logo ve link gorunurlugunu test eder


  Scenario:TC19 Kullanici title'da verilen degerin icermedigini test eder


    Given kullanici "bestUrl" anasayfaya gider
    Then sayfa Url'in "bestUrl" 'e esit olduugunu test eder
    Then sayfa basliginin "Rest" icermedigini test eder
    Then BestBuy logosunun goruntulendigini test eder
    Then Fransizca linkinin goruntulendigini test eder

