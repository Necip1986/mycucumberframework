@regression
Feature: US1009 Ck Hotels Login

  @smoke
  Scenario: TC11 kullanici gecersiz bilgilerle giris yapar
    Given kullanici "Ck_Hotels" ana sayfasina gider
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici "3" sn bekler
    And kullanici sayfayi kapatir

