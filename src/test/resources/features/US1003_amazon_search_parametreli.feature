@regression
Feature: US1003_amazon_search_parametreli


  @amazon
  Scenario: TC05_parametre_kullanma
    When kullanici amazon ana sayfasina gider
    And "teapot" icin arama yapar
    Then sonucun "kemal" icerdigini test eder
    And kullanici sayfayi kapatir