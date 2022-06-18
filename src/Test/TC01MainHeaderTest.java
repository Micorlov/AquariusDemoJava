package Test;

import Asserts.MainHeaderAsserts;
import Elements.MainHeaderElements;
import Elements.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TC01MainHeaderTest {

    WebDriver driver;
    String urlAquariusEnginesMainPage = URL.aquariusEnginesMainPage;

    @Test(priority = 1)
    public void HomeButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheHomeButton(driver);
        MainHeaderAsserts.AssertHomePageUrl(driver);
        MainHeaderAsserts.AssertHomePageTitle(driver);
    }

    @Test(priority = 2)
    public void BreakthroughButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheBreakthroughButton(driver);
        MainHeaderAsserts.BreakthroughUrl(driver);
        MainHeaderAsserts.BreakthroughTitle(driver);
    }

    @Test(priority = 3)
    public void MarketsButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheMarketsButton(driver);
        MainHeaderAsserts.marketsUrl(driver);
        MainHeaderAsserts.marketsTitle(driver);
    }

    @Test(priority = 4)
    public void TechnologyButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheTechnologyButton(driver);
        MainHeaderAsserts.technologyUrl(driver);
        MainHeaderAsserts.technologyTitle(driver);
    }

    @Test(priority = 5)
    public void InvestorsButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheInvestorsButton(driver);
        MainHeaderAsserts.investorsUrl(driver);
        MainHeaderAsserts.investorsTitle(driver);
    }

    @Test(priority = 6)
    public void PressButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnThePressButton(driver);
        MainHeaderAsserts.pressUrl(driver);
        MainHeaderAsserts.pressTitle(driver);
    }

    @Test(priority = 7)
    public void TeamButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheTeamButton(driver);
        MainHeaderAsserts.teamUrl(driver);
        MainHeaderAsserts.teamTitle(driver);
    }

    @Test(priority = 8)
    public void CareersButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheCareersButton(driver);
        MainHeaderAsserts.careersUrl(driver);
        MainHeaderAsserts.careersTitle(driver);
    }

    @Test(priority = 9)
    public void ContactButton() throws InterruptedException {

        driver.navigate().to(urlAquariusEnginesMainPage);
        MainHeaderElements.userTapsOnTheContactButton(driver);
        MainHeaderAsserts.contactUrl(driver);
        MainHeaderAsserts.contactTitle(driver);
    }

    @BeforeTest
    public void setup() {
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
    }


    @AfterTest
    public void AfterTest() {
        System.out.println("After Test method");
        driver.close();
    }


}
