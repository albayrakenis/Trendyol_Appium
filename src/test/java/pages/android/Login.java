package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class Login {

    public Login(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(10)) ,this);


    }

    @AndroidFindBy(id = "trendyol.com:id/editTextEmail")
    public MobileElement emailTextbox;

    @AndroidFindBy(id = "trendyol.com:id/editTextPassword")
    public MobileElement passwordTextbox;

    @AndroidFindBy(id = "trendyol.com:id/buttonLogin")
    public MobileElement girisYapButton;



}
