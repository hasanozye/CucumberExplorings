@featurebitch

Feature: US110_Editor Kayit
  Scenario Outline: TC16
  
  Given kullanici "EDB" sayfasina gider
  Then new butonuna basar
  Then firstname olarak "<firstname>" girer
  Then Lastname olarak "<Lastname>" girer
    Then Position olarak "<position>" girer
    Then Office olarak "<office>" girer
    Then Extension olarak "<extension>" girer
    Then Start date olarak "<startdate>" girer
    Then Salary olarak "<salary>" girer
  And kullanici Create tusuna basar
  When kullanici "<firstname>" ile arama yapar
  And isim bolumunde "<firstname>" dogrular
    Examples:
      | firstname | Lastname | position | office | extension | startdate | salary |
      | alkan | tuncer | DEVOPS | nc | qa | 2022-10-10 | 100000 |
      | MUHAMMED | guney | DEVOPS | almanya | qa | 2022-10-10 | 12300000 |
      | hasan | ozyer | QA consultant | dubai | qa | 2022-10-10 | 100000 |







#DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun ve 5 farkli kayit
  #ekleyin
  #
  #When kullanici https://editor.datatables.net/ adresine gider
  #Then new butonuna basar And tum bilgileri girer And Create tusuna basar
  #When kullanici ilk isim ile arama yapar
  #Then isim bolumunde isminin oldugunu dogrular