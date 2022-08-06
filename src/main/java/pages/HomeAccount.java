package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import testng.ContactManagerTestng;

public class HomeAccount {
    public HomeAccount(){
    PageFactory.initElements(new AppiumFieldDecorator(ContactManagerTestng.Driver), this);

}
    @AndroidFindBy(id = "addHomeAccount")
    private MobileElement addMobileAccountBtn;

    @AndroidFindBy(id = "addHomeAccount")
    public static MobileElement addHomeAccountBtn1;

    @AndroidFindBy(id = "showInvisible")
    private MobileElement invisibleCheck;

}
