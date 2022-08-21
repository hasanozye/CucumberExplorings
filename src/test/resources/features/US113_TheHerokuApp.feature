@heroKupApp

Feature: US113_TheHerokuApp
  Scenario: herkuapp'de remove/add elements yapmak
    Given kullanici "HKA" sayfasina gider
    Then addElement butonuna basar
    Then delete butonu gorunene kadar bekler
    And delete butonu gorunurlugu test eder
    And delete butonuna basarak butonu siler
    Then delete butonunun gorunmedigini test eder
  Then kullanici sayfayi kapatir








    #//todo
    #//Yeni bir test methodu olusturalim
    #//https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    #//“Add Element” butona basin
    #//“Delete” butonu gorunur oluncaya kadar bekleyin
    #//“Delete” butonunun gorunur oldugunu test edin
    #//Delete butonuna basarak butonu silin
    #//Delete butonunun gorunmedigini test edin