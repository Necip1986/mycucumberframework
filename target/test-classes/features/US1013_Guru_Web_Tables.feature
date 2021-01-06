Feature: US1012_Guru_Web_Tables

  @guru
  Scenario: TC_16_kullanici_liste_alabilmeli
    Given kullanici "guru_url" ana sayfasina gider
    Then Company listesini consola yazdirir
    And "DCB Bank" listede oldugunu test eder