package testng;

import devices.DeviceFarm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pages.*;
import utility.DeviceFarmUtility;

import javax.swing.text.Utilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
package testng;

public class ContactManagerTestng {

    public static AppiumDriver<?> Driver;
    HomePage homePage;
    AddContactPage addContactPage;
    MobileAccount MobileAcc;
    WorkAccount workaccount;
    HomeAccount homeAcc;
    String oreo, kitkat;
    DesiredCapabilities capabilities;

    public ContactManagerTestng(){
        oreo = DeviceFarm.ANDROID_OREO.path;
        kitkat = DeviceFarm.ANDROID_KITKAT.path;
    }

    @BeforeClass
    public void setup() throws MalformedURLException {

        capabilities = new DesiredCapabilities();
        capabilities = DeviceFarmUtility.pathToDesiredCapabilitites(this.oreo);
        capabilities.setCapability("app", new File("src/test/resources/apps/ContactManager.apk").getAbsolutePath());
        Driver = new AndroidDriver(new URL("http://127.0.0.1:8080/wd/hub"), capabilities);
        homePage = new HomePage();
        addContactPage = new AddContactPage();
        MobileAcc = new MobileAccount();
        workaccount = new WorkAccount();
        homeAcc = new HomeAccount();


    }

    @Test(priority = 0)
    public void openAddContactOnOreo() throws NullPointerException, InterruptedException {

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    @Test(priority = 1)
    public void checkMobileAccountTitle(){
        Assert.assertEquals(MobileAccount.getTitle().getText(),"Add Mobile Account");
    }
    @AfterClass
    public void waiter() throws InterruptedException {
        Thread.sleep(5000);
    }
    @Test(priority = 0)
    public void openMobileAccountOnOreo() throws NullPointerException, InterruptedException {

        homePage.getMobileAccountBtn().click();
        Thread.sleep(4000);
    }

    @Test(priority = 1)
    public void checkAddContactTitle(){
        Assert.assertEquals(MobileAccount.getTitle().getText(),"Add Mobile Account");
    }
    @AfterClass
    public void waiter() throws InterruptedException {
        Thread.sleep(5000);
    }

}

    @Test(priority = 0)
    public void openAWorkAccountOnOreo() throws NullPointerException, InterruptedException {

        homePage.getWorkAccountBtn().click();
        Thread.sleep(4000);
    }

    @Test(priority = 1)
    public void checkWorkAccountTitle(){
        Assert.assertEquals(WorkAccountAccount.getTitle().getText(),"Add Work Account");
    }
    @AfterClass
    public void waiter() throws InterruptedException {
        Thread.sleep(5000);
    }
    @Test(priority = 0)
    public void openHomeAccountOnOreo() throws NullPointerException, InterruptedException {

        homePage.getHomeAccountBtn().click();
        Thread.sleep(4000);
    }

    @Test(priority = 1)
    public void checkHomeAccountTitle(){
        Assert.assertEquals(HomeAccount.getTitle().getText(),"Add Home Account");
    }
    @AfterClass
    public void waiter() throws InterruptedException {
        Thread.sleep(5000);
    }

}
}
