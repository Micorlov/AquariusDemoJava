package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPageElements {


    public static void UserTapOnSendButton(WebDriver driver) throws InterruptedException {

        Thread.sleep(2000);
        WebElement sendButton = driver.findElement(By.cssSelector("#wpcf7-f22-o1 > form > div:nth-child(6) > div > input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sendButton);
        Thread.sleep(500);
        sendButton.click();
    }

    public static void UserEnterDataToFieldName(WebDriver driver) throws InterruptedException {
        WebElement name = driver.findElement(By.name("your-name"));
        Thread.sleep(1000);
        name.sendKeys("Michael");
        Thread.sleep(1000);
    }

    public static void UserEnterDataToFieldEmail(WebDriver driver) throws InterruptedException {
        WebElement email = driver.findElement(By.name("your-email"));
        Thread.sleep(1000);
        email.sendKeys("TestUser@gmail.com");
        Thread.sleep(1000);
    }

    public static void UserEnterDataToFieldMessage(WebDriver driver) throws InterruptedException {
        WebElement message = driver.findElement(By.name("your-message"));
        Thread.sleep(1000);
        message.sendKeys("Some Message");
        Thread.sleep(1000);
    }


    public static void UserTapsOnTheCloseButton(WebDriver driver) throws InterruptedException {
        WebElement closeButton = driver.findElement(By.cssSelector("#contacts > div > a > svg > path"));
        Thread.sleep(1000);
        closeButton.click();
        Thread.sleep(2000);

    }


}
