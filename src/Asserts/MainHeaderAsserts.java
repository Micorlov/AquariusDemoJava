package Asserts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainHeaderAsserts {

    public static void AssertHomePageUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/");
    }

    public static void AssertHomePageTitle(WebDriver driver){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Homepage - Aquarius Engines");
    }

    public static void BreakthroughUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/#breakthrough");
    }

    public static void BreakthroughTitle(WebDriver driver){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Homepage - Aquarius Engines");
    }


    public static void marketsUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/#markets");
    }

    public static void marketsTitle(WebDriver driver){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Homepage - Aquarius Engines");
    }


    public static void technologyUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/technology/");
    }

    public static void technologyTitle(WebDriver driver){
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "TECHNOLOGY - Aquarius Engines");
    }


    public static void investorsUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/investors/");
    }

    public static void investorsTitle(WebDriver driver){
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "Investor Relations - Aquarius Engines");
    }


    public static void indicationsUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://sensible-medical.com/indications-for-use/");
    }

    public static void indicationsTitle(WebDriver driver){
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "noninvasive monitoring & management of patients with fluid management problems");
    }

    public static void pressUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/press/");
    }

    public static void pressTitle(WebDriver driver){
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "PRESS - Aquarius Engines");
    }


    public static void teamUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/team/");
    }

    public static void teamTitle(WebDriver driver){
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "Executive Team - Aquarius Engines");
    }

    public static void careersUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/careers/");
    }

    public static void careersTitle(WebDriver driver){
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "Careers - Aquarius Engines");
    }

    public static void contactUrl(WebDriver driver){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.aquariusengines.com/#contacts");
    }

    public static void contactTitle(WebDriver driver){
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "Homepage - Aquarius Engines");
    }












}
