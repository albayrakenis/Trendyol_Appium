
Feature: Pozitif login testi


  @login @smoke
  Scenario: Kullanici login olabilmeli
    Given kullanici trendyol uygulamasını acar
    And kullanici hesabım tab ina tiklar
    Then kullanici mail olarak "ValidEmail" girer
    And kullanici password olarak "ValidPassword" girer
    And kullanici giris yap butonuna tiklar
    And kullanicinin basarili olarak giris yaptıgı test edilir
    And kullanici uygulamayi kapatir

