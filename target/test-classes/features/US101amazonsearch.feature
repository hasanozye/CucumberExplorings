@paralel1

Feature: US101amazon_search

  Scenario: TC1_Amazon Search Test
    Given user goes thru amazon webPage
    And searchs for Iphone
    Then sees if results contains iphone.

    Given user goes thru amazon Webpage
    And searches for tea pot
    Then Sees if results contains tea pot

    Given  user goes thru amazon webPage
    And SEARCHS FOR FLOWER
    Then  sees if results contains flower
