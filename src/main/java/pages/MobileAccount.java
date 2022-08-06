package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import testng.ContactManagerTestng;

public class MobileAccount {

    public MobileAccount(){
    PageFactory.initElements(new AppiumFieldDecorator(ContactManagerTestng.Driver), this);

}
    @AndroidFindBy(id = "addMobileAccount")
    private MobileElement addMobileAccountBtn;

    @AndroidFindBy(id = "addMobileAccount")
    public static MobileElement addCMobileAccountBtn1;

    @AndroidFindBy(id = "showInvisible")
    private MobileElement invisibleCheck;

}
