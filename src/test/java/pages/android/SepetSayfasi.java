package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SepetSayfasi {

    public SepetSayfasi(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(10)) ,this);
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sepetim']")
    public MobileElement sepetimTab;

    @AndroidFindBy(id = "trendyol.com:id/image_add")
    public MobileElement sepetteUrunArtirma;

    @AndroidFindBy(id = "trendyol.com:id/buttonApproveBasket")
    public MobileElement sepetiOnayla;

    @AndroidFindBy(id = "trendyol.com:id/imageLeft")
    public MobileElement guvenliOdemeCikis;

    @AndroidFindBy(id = "trendyol.com:id/textViewSalePrice")
    public MobileElement sepetteUrunFiyati;

    @AndroidFindBy(id = "trendyol.com:id/imageViewFreeCargoBox")
    public MobileElement kargoBedavaYazisi;

    @AndroidFindBy(id = "trendyol.com:id/imageViewDeleteProduct")
    public MobileElement sepettenUrunSilme;

    @AndroidFindBy(id = "trendyol.com:id/textViewBasketRemoveAndAddFavoritesAction")
    public MobileElement sepettenSilveFavorilereEkle;



}
