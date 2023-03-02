package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class Homepage {



    public Homepage(){
        AndroidDriver<AndroidElement> driver;
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(10)) ,this);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Anasayfa']")
    public MobileElement anasayfa;

    @AndroidFindBy(xpath = "trendyol.com:id/edittext_search_view")
    public MobileElement aramaKutusu;

    public void urunArama(String aramaKelimesi){
        WebElement aramaSonucSayfasi = Driver.getAppiumDriver().findElement(By.xpath("//android.widget.TextView[@text='" + aramaKelimesi + "']"));
        aramaSonucSayfasi.click();
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Favorilerim']")
    public MobileElement favorilerim;


    @AndroidFindBy(id = "trendyol.com:id/buttonSelectGenderMan")
    public MobileElement cinsiyetSecimi;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Hesabım']")
    public MobileElement hesabimTab;


    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    public MobileElement cancelEmailSelectButton;


    @AndroidFindBy(id = "trendyol.com:id/textViewWelcoming")
    public MobileElement nameSurnameText;


}
