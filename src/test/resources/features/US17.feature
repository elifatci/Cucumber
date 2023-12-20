Feature:US17 Kullanici bilgilerini girerek isim bolumunde ismini dogrulamali



  Scenario:TC25 Kullanici ismini aratip isminin gorunur oldugunu dogrular

    Given kullanici "editorUrl" adresine gider
    Then new butonuna basar
    And tum bilgileri girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
