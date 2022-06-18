package Test;

import Asserts.ContactAsserts;
import Asserts.MainHeaderAsserts;
import Elements.ContactPageElements;
import Elements.MainHeaderElements;
import Elements.URL;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class TC02ContactUsTest {

    WebDriver driver;

    @Test(priority = 1)
    public void UserEnterEmptyFieldsNameEmailMessage() throws InterruptedException {

        ContactPageElements.UserTapOnSendButton(driver);
        ContactAsserts.AssertNameFieldIsRequiredAlarmIsDisplayed(driver);
        ContactAsserts.AssertEmailFieldIsRequiredAlarmIsDisplayed(driver);
        ContactAsserts.AssertMessageFieldIsRequiredAlarmIsDisplayed(driver);
    }

    @Test(priority = 2)
    public void UserVerifyPlaceHolders() throws InterruptedException {
        ContactAsserts.AssertNameTextPlaceholder(driver);
        ContactAsserts.AssertEmailTextPlaceholder(driver);
        ContactAsserts.AssertMessageTextPlaceholder(driver);
    }

    @Test(priority = 3)
    public void UserEnterDataToFieldsNameEmailMessage() throws InterruptedException {

        ContactPageElements.UserEnterDataToFieldName(driver);
        ContactPageElements.UserEnterDataToFieldEmail(driver);
        ContactPageElements.UserEnterDataToFieldMessage(driver);
    }

    @Test(priority = 4)
    public void UserCloseTheContactPage() throws InterruptedException {
        ContactPageElements.UserTapsOnTheCloseButton(driver);
        MainHeaderAsserts.AssertHomePageTitle(driver);
    }

    @BeforeTest
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Newfolder\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("start-maximized");
        options.addArguments("--js-flags=--expose-gc");
        options.addArguments("--enable-precise-memory-info");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-default-apps");
        options.addArguments("test-type=browser");
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(URL.aquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheContactButton(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("After Test method");
        driver.close();
    }

}
