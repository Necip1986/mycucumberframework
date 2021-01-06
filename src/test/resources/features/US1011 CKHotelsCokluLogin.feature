
Feature: US1011_CKHotel Coklu Login Deneme
  Scenario Outline: TC12_CKHotel Coklu Login 1
    When kullanici "Ck_Hotels" ana sayfasina gider
    Then Log in yazisina tiklar
    And Username text Box'ina "<username>" girer
    And Password textBox'ina "<password>" girer
    Then Login butonuna basar
    Then kullanici login olmadigini dogrular

    Examples:
      | username | password |
      |Manager   |Manager   |
      |Manager1  |Manager1  |
      |Manager2  |Manager2  |
      |Manager3  |Manager3  |
      |Manager3  |Manager4  |

