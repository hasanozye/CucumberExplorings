@Wuniversity

Feature: US112_Web University
  Scenario Outline: TC17 webdriveruniversity gitme
  
  Given kullanici "WDU" sayfasina gider
  Then sayfada assagiIn
  Then loginPortal butonuna bas
  Then diger windowa gec
  Then "<username>" ve "<password>"
  And WebUniversity Login butonuna basar
  And Popup'ta cikan yazinin "validation failed" oldugunu test edin
  Then Ok diyerek Popup'i kapatin
  And ilk sayfaya geri donun
  And ilk sayfaya donuldugunu test edin
    And screenshot alin
    Then biraz 3 saniye bekle
    Examples:
      | username | password |
      | Ali | Ozyer |

    
    
    
    
    
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