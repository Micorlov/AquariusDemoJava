package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MainHeaderElements {


    //Main Header Buttons

    public static void userTapsOnTheHomeButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-32"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnTheBreakthroughButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-44"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnTheMarketsButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-45"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnTheTechnologyButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-36"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnTheInvestorsButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-2961"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnIndicationsButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-557"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnThePressButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-34"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnTheTeamButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-35"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnTheCareersButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-2333"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }

    public static void userTapsOnTheContactButton(WebDriver driver) throws InterruptedException {
        WebElement homeButton = driver.findElement(By.id("menu-item-47"));
        Thread.sleep(1000);
        homeButton.click();
        Thread.sleep(1000);
    }











}
