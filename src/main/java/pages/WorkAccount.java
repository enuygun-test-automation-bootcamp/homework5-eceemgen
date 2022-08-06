package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import testng.ContactManagerTestng;

public class WorkAccount {

    public WorkAccount(){
        PageFactory.initElements(new AppiumFieldDecorator(ContactManagerTestng.Driver), this);

    }
    @AndroidFindBy(id = "addWorkAccount")
    private MobileElement addMobileAccountBtn;

    @AndroidFindBy(id = "addWorkAccount")
    public static MobileElement addWorkAccountBtn1;

    @AndroidFindBy(id = "showInvisible")
    private MobileElement invisibleCheck;

}
