package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.android.Homepage;
import pages.android.SepetSayfasi;
import pages.android.UrunSayfasi;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Test02_UrunuSepeteEkleme {

    Homepage homepage = new Homepage();
    UrunSayfasi urunSayfasi = new UrunSayfasi();
    SepetSayfasi sepetSayfasi = new SepetSayfasi();
    @Then("kullanici {string} aratir")
    public void kullanici_aratir(String aranacakKelime) {
        homepage.urunArama(aranacakKelime);

    }
    @Then("kullanici {string} olarak listeler")
    public void kullanici_olarak_listeler(String siralamaKriteri) {
       urunSayfasi.urunSiralama(siralamaKriteri);

    }
    @Then("kullanici {int} . siradaki urunu seser ve sepete ekler")
    public void kullanici_siradaki_urunu_secer_ve_sepete_ekler(Integer int1) {

        urunSayfasi.belliSiradakiUrunuSecme(int1);
        urunSayfasi.urunSepeteAt.click();
        sepetSayfasi.sepetiOnayla.click();
        urunSayfasi.sepeteEklendiPopupKapatma.click();
    }
    @And("kullanici sepette urunun fiyatini ve kargo bedavayi kontrol eder")
    public void kullaniciSepetteUrununFiyatiniVeKargoBedavayiKontrolEder() {

        if(sepetSayfasi.sepetteUrunFiyati.getText().length()>3){
            Assert.assertTrue(sepetSayfasi.kargoBedavaYazisi.getText().toLowerCase().contains("kargo bedava"));
        }

    }

    @And("kullanici sepette urun miktarini artirir")
    public void kullaniciSepetteUrunMiktariniArtirir() {

        sepetSayfasi.sepetteUrunArtirma.click();
    }
    @Then("kullanici urunu sepetten silip favorilere ekler")
    public void kullanici_urunu_sepetten_silip_favorilere_ekler() {

        sepetSayfasi.sepettenUrunSilme.click();
        sepetSayfasi.sepettenSilveFavorilereEkle.click();

    }
    @Then("kullanici favorilere gidip urunu kontrol eder")
    public void kullanici_favorilere_gidip_urunu_kontrol_eder() {
        Driver.getAppiumDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homepage.anasayfa.click();
        homepage.favorilerim.click();
        Assert.assertTrue(urunSayfasi.urunSepeteAt.isDisplayed());


    }



}
