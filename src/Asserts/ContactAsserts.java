package Asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactAsserts {


    public static void AssertNameFieldIsRequiredAlarmIsDisplayed(WebDriver driver){
        String nameFieldWarning = driver.findElement(By.cssSelector("#wpcf7-f22-o1 > form > div:nth-child(3) > div > span > span")).getText();
        Assert.assertEquals(nameFieldWarning, "The field is required.");
    }


    public static void AssertEmailFieldIsRequiredAlarmIsDisplayed(WebDriver driver){
        String emailFieldWarning = driver.findElement(By.cssSelector("#wpcf7-f22-o1 > form > div:nth-child(4) > div > span > span")).getText();
        Assert.assertEquals(emailFieldWarning, "The field is required.");
    }

    public static void AssertMessageFieldIsRequiredAlarmIsDisplayed(WebDriver driver){
        String messageFieldWarning = driver.findElement(By.cssSelector("#wpcf7-f22-o1 > form > div:nth-child(5) > div > span > span")).getText();
        Assert.assertEquals(messageFieldWarning, "The field is required.");
    }

    public static void AssertNameTextPlaceholder(WebDriver driver){
        String nameText = driver.findElement(By.name("your-name")).getAttribute("placeholder");
        Assert.assertEquals(nameText, "Name");
    }

    public static void AssertEmailTextPlaceholder(WebDriver driver){
        String nameText = driver.findElement(By.name("your-email")).getAttribute("placeholder");
        Assert.assertEquals(nameText, "E-mail");
    }

    public static void AssertMessageTextPlaceholder(WebDriver driver){
        String nameText = driver.findElement(By.name("your-message")).getAttribute("placeholder");
        Assert.assertEquals(nameText, "Message");
    }

}
