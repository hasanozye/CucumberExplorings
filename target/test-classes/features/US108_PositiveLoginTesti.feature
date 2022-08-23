@hotel
Feature: US108 Pozitifi login test

  Scenario: TC11 pozitive login

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    Then kullanici adi olarak "HMCValidUsername" girer
    Then password olarak "HMCValidPassword" girer
    Then login butonuna basar
    When basarili olarak giris yaptigini test eder
    Given user goes thru amazon Webpage
    Then SEARCHS FOR FLOWER
    And sayfayi kapatir