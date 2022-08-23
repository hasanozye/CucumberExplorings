@Webu @testparalel2
Feature: US112 WebUniversity Window Handle

  Scenario Outline: TC17 Reusuble Methots ile window handle

    Given kullanici "WDU" sayfasina gider
    And Login Porta' a kadar asagi iner
    And Login Portala tiklar
    And Diger window'a gecin
    Then "<usurname>" ve "<password>" kutularina deger yazar
    And WebUniversity Login butonuna basar
    And Popup'ta cikan yazinin "validation failed" oldugunu test edin
    Then Ok diyerek Popup'i kapatin
    And Ilk sayfaya geri donun
    And Ilk sayfaya donuldugunu test edin
    Then biraz 3 saniye bekle
    And sayfayi kapatir
    Examples:
      | usurname | password |
      | Bilal | SAFAK |

    
    
    
    
    
    #"http://webdriveruniversity.com/" adresine gidin
  #"Login Portal" a kadar asagi inin
  #"Login Portal" a tiklayin
  #Diger window'a gecin
  #"username" ve "password" kutularina deger yazdirin
  # WebUniversity Login butonuna basar
  #Popup'ta cikan yazinin "validation failed" oldugunu test edin
  #Ok diyerek Popup'i kapatin
  #Ilk sayfaya geri donun
  #Ilk sayfaya donuldugunu test edin