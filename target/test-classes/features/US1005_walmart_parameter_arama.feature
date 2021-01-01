@regression
Feature: US1005_walmart_parameter_arama


  Scenario Outline: TC07_aranan_kelime_title’da_olmali
    Given kullanici walmart ana sayfasina gider
    And walmart sayfasinda "<aranankelime>" icin arama yapar
    Then walmart'ta bulunan sonucun "<aranankelime>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
    |aranankelime|
    |Nutella|
    |pencil|
    |milk  |
    |tomatoes|
    |popcorn|

