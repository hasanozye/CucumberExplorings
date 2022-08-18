
@parametre
Feature: Parametreli step definiton

  Scenario: TC04_parametre kullanımı
    Given user goes thru amazon webPage
    And searchs for Iphone
    Then sees if results contains iphone.
    And sayfayi kapatir