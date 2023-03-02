package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.android.Homepage;
import pages.android.Login;
import utilities.ConfigReader;
import utilities.Driver;

public class Test01_LoginTest {

    Homepage homepage = new Homepage();
    Login login = new Login();


    @Given("kullanici trendyol uygulamasını acar")
    public void kullanici_trendyol_uygulamasini_acar() {
        Driver.getAppiumDriver();
    }
    @Given("kullanici hesabım tab ina tiklar")
    public void kullanici_hesabim_tab_ina_tiklar() {
        homepage.hesabimTab.click();

    }

    @Then("kullanici mail olarak {string} girer")
    public void kullaniciMailOlarakGirer(String mail) {
        login.emailTextbox.sendKeys(ConfigReader.getProperty(mail));
    }

    @And("kullanici password olarak {string} girer")
    public void kullaniciPasswordOlarakGirer(String password) {
        login.passwordTextbox.sendKeys(ConfigReader.getProperty(password));
    }


    @And("kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        login.girisYapButton.click();
        Driver.getAppiumDriver().navigate().back();
        //homepage.touchScreen.click();
    }

    @And("kullanicinin basarili olarak giris yaptıgı test edilir")
    public void kullanicininBasariliOlarakGirisYaptigiTestEdilir() {
        String actualNameSurname = homepage.nameSurnameText.getText();
        String expectedNameSurname = ConfigReader.getProperty("UserNameSurname");
        Assert.assertEquals(expectedNameSurname,actualNameSurname);
    }

    @And("kullanici uygulamayi kapatir")
    public void kullaniciUygulamayiKapatir() {
        Driver.quitAppiumDriver();
    }
}
