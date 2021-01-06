Feature: US1012_AutomationPracticeCreateAccount

  @practice
  Scenario: TC13_AutomationPractice CreateAccount Test
    Given kullanici "autopractice" ana sayfasina gider
    And user sign in linkine tiklar
    And user Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin

  @automation
  Scenario: TC_14_Yanlis_mail_ile_giris_yapilamaz
    Given kullanici "autopractice" ana sayfasina gider
    And user sign in linkine tiklar
    And email kutusuna gecersiz email yazar ve enter'a basar
    And hata mesajini dorular
