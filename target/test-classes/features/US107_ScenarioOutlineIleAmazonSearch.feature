Feature: US107_ScenarioOutlineIleAmazonSearch

  Scenario Outline: TC10 amazonda bir listenin tüm elementlerini aratmakk
    Given kullanici "AmazonURL" sayfasina gider
    Then "<aranacakEleman>" icin arama yapar
    And Sonuclarin "<aranacakEleman>" icerdiğini test eder
    Then sayfayi kapatir



    Examples:
      |aranacakEleman|
      |car|
      |video games|
      |java|
      |javascript|
      |Flutter|
      |MongoDB|