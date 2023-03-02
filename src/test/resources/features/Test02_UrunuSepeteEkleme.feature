Feature:Sepete urun ekleme


  @favori @smoke
  Scenario Outline: Kullanici urunu sepete ekleyebilmeli
    Given kullanici trendyol uygulamasını acar
    And kullanici hesabım tab ina tiklar
    Then kullanici mail olarak "ValidEmail" girer
    And kullanici password olarak "ValidPassword" girer
    And kullanici giris yap butonuna tiklar
    And kullanici "<Aranacak urun>" aratır
    And kullanici "<Siralama>" olarak listeler
    And kullanici 1 . siradaki urunu seser ve sepete ekler
    And kullanici sepette urunun fiyatini ve kargo bedavayi kontrol eder
    And kullanici sepette urun miktarini artirir
    And kullanici urunu sepetten silip favorilere ekler
    And kullanici favorilere gidip urunu kontrol eder
    And kullanici uygulamayi kapatir


    Examples:
      | Aranacak urun       | Siralama       |
      | Laptop Çantası      | Çok Satanlar   |
      | Erkek Deri Ayakkabı | En Düşük Fiyat |
      | Çamaşır Makinesi    | En Favoriler   |



