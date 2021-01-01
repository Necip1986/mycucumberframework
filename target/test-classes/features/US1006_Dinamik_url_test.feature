@regression
Feature: US1006_Dinamik_url_test


  @smoke
  Scenario Outline: TC08_yazilan_her_url’e_gitmeli

    When kullanici "<istenenUrl>" ana sayfasina gider
    Then "<istenenUrl>" de oldugunu test eder
    And kullanici sayfayi kapatir


    Examples:
      |istenenUrl|
      |amazon|
      |bestbuy|
      |walmart|

