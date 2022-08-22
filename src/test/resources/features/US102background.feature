@amazontum
Feature: US102background ile amazon search test

  Background: amazon sayfasina gider
    Given user goes thru amazon Webpage

  @amazonspace
  Scenario: TC01_Amazon Iphone search Testi
    And searchs for Iphone
    Then sees if results contains iphone.

  @amazoncorona
  Scenario: TC02_Amazon teapot Search testi
    And searches for tea pot
    Then Sees if results contains tea pot

  @amazonspace
  Scenario: TC03_Amazon flower Search Testi
    And SEARCHS FOR FLOWER
    Then sees if results contains flower