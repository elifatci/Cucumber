@API
Feature:US JsonPlaceHolderApi Test

  Scenario: TC JSonPlaceHolderGet Test

    Given JsonPlaceHolder sitesine gidilir
    And get sorgusu yapılır
    Then body assert edilir