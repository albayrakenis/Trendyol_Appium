//package stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import pages.android.Homepage;
//import pages.android.Login;
//import utilities.ConfigReader;
//import utilities.Driver;
//
//import java.util.concurrent.TimeUnit;
//
//public class Test01 {
//
//    Login login =new Login();
//    Homepage homepage =new Homepage();
//
//    @Given("Kullanici giris sayfasina gitmeli")
//    public void kullaniciGirisSayfasinaGitmeli() throws InterruptedException {
//        Driver.getAppiumDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        homepage.hesabimTab.click();
//        Thread.sleep(2000);
//
//
//    }
//
//    @When("Kullanici kullanici adi ve sifresini girmeli")
//    public void kullaniciKullaniciAdiVeSifresiniGirmeli() throws InterruptedException {
//        Driver.getAppiumDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        login.emailTextbox.sendKeys(ConfigReader.getProperty("eposta"));
//        Thread.sleep(2000);
//        login.emailTextbox.sendKeys(ConfigReader.getProperty("parola"));
//        homepage.hesabimTab.click();
//    }
//}
