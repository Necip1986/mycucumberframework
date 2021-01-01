@regression
Feature: US1002_amazon_search_background

  Background:
    Given kullanici amazon ana sayfasina gider

  @smoketest @amazon
  Scenario: TC02_amazon_iphone_arama_testi

    And iphone icin arama yapar
    Then sonucun iphone icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC03_amazon_teapot_arama_testi
    And teapot icin arama yapar
    Then sonucun teapot icerdigini test eder
    And kullanici sayfayi kapatir

      @necip @smoketest
      Scenario: TC04_amazon_flower_arama_testi
      And flower icin arama yapar
      Then sonucun iphone icerdigini test eder
      And kullanici sayfayi kapatir