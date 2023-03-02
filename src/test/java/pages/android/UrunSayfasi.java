package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class UrunSayfasi {

    public UrunSayfasi(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(10)) ,this);
    }

    @AndroidFindBy(id = "trendyol.com:id/add_cart")
    public MobileElement urunSepeteAt;

    public void urunSiralama(String siralama){
        WebElement siralamaSecenegi = Driver.getAppiumDriver().findElement(By.xpath("//android.widget.RadioButton[@text='"+siralama+"']"));
        siralamaSecenegi.click();
    }

    public void belliSiradakiUrunuSecme(int numara){
        WebElement siraliUrunu = Driver.getAppiumDriver().findElement(By.xpath("(//android.widget.TextView[@text='Sepete Ekle'])["+numara+"]"));
        siraliUrunu.click();
    }

    @AndroidFindBy(id = "trendyol.com:id/imageViewTooltipClose")
    public MobileElement sepeteEklendiPopupKapatma;
}
