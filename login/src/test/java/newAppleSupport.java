import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import java.util.*;
public class newAppleSupport {
    private WebDriver driver3;

    @Test
    public void newAppleSupport() {
        System.setProperty("webdriver.chrome.driver" , "/home/neto/IdeaProjects/login/driver/drivers/chromedriver");
        driver3 = new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("https://www.apple.com/br/");
        driver3.manage().window().maximize();
        driver3.findElement(By.linkText("Suporte")).click();
        driver3.findElement(By.cssSelector(".as-imagegrid-item:nth-child(2) .as-imagegrid-img")).click();
        driver3.findElement(By.cssSelector(".as-content-block:nth-child(4) .icon-copy")).click();
        driver3.findElement(By.cssSelector(".as-content-block:nth-child(3) .column:nth-child(1) .icon-copy")).click();
        driver3.findElement(By.cssSelector("#sections > div:nth-child(2) > h2")).click();
        driver3.findElement(By.cssSelector("#sections > div:nth-child(2) > h2")).click();
        driver3.findElement(By.cssSelector("div:nth-child(6) > h2")).click();
        driver3.findElement(By.id("questionInputField")).click();
        driver3.findElement(By.id("questionInputField")).sendKeys("test");
        driver3.findElement(By.cssSelector(".questionSubmitFormButton")).click();
        driver3.switchTo().frame(0);
        driver3.quit();
        System.out.println("Fim do Test! @Developer Valmir Junior");
    }
}
