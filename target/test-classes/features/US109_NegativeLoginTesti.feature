@negative
  Feature: US109_NegativeLoginTesti

    Scenario: TC12 Yanlis username dogru password ile giris yap

      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tiklar
      Then kullanici adi olarak "HMCWrongUsername" girer
      Then password olarak "HMCValidPassword" girer
      Then login butonuna basar
      And giris yapilamadigini test eder
      And sayfayi kapatir

    Scenario: TC13 Dogru username yanlis password ile giris yap

      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tiklar
      Then kullanici adi olarak "HMCValidUsername" girer
      Then password olarak "HMCWrongPassword" girer
      Then login butonuna basar
      And giris yapilamadigini test eder
      And sayfayi kapatir

    Scenario: TC14 Yanlis username yanlis password ile giris yap

      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tiklar
      Then kullanici adi olarak "HMCWrongUsername" girer
      Then password olarak "HMCWrongPassword" girer
      Then login butonuna basar
      And giris yapilamadigini test eder
      And sayfayi kapatir