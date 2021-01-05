
Feature: US1010_CKHotel Coklu Login Deneme
  Scenario: TC12_CKHotel Coklu Login 1
    When kullanici "Ck_Hotels" ana sayfasina gider
    Then Log in yazisina tiklar
    And Username text Box'ina "Manager" girer
    And Password textBox'ina "Manager" girer
    Then Login butonuna basar
    Then kullanici login olmadigini dogrular

  Scenario: TC13_CKHotel Coklu Login 2
    When kullanici "Ck_Hotels" ana sayfasina gider
    Then Log in yazisina tiklar
    And Username text Box'ina "Manager1" girer
    And Password textBox'ina "Manager1" girer
    Then Login butonuna basar
    Then kullanici login olmadigini dogrular

  Scenario: TC14_CKHotel Coklu Login 3
    When kullanici "Ck_Hotels" ana sayfasina gider
    Then Log in yazisina tiklar
    And Username text Box'ina "Manager2" girer
    And Password textBox'ina "Manager2" girer
    Then Login butonuna basar
    Then kullanici login olmadigini dogrular

  Scenario: TC15_CKHotel Coklu Login 4
    When kullanici "Ck_Hotels" ana sayfasina gider
    Then Log in yazisina tiklar
    And Username text Box'ina "Manager3" girer
    And Password textBox'ina "Manager3" girer
    Then Login butonuna basar
    Then kullanici login olmadigini dogrular

  Scenario: TC16_CKHotel Coklu Login 5
    When kullanici "Ck_Hotels" ana sayfasina gider
    Then Log in yazisina tiklar
    And Username text Box'ina "Manager4" girer
    And Password textBox'ina "Manager4" girer
    Then Login butonuna basar
    Then kullanici login olmadigini dogrular