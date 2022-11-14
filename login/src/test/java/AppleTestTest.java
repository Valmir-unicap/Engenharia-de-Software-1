import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;


public class AppleTestTest {
    private WebDriver driver;

    @Test
    public void appleTest() {
        System.setProperty("webdriver.chrome.driver" , "/home/neto/IdeaProjects/login/driver/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.apple.com/br/");
        assertEquals("https://www.apple.com/br/" , driver.getCurrentUrl());
        driver.findElement(By.linkText("Mac")).click();
        driver.findElement(By.cssSelector(".macbook-air")).click();
        assertThat(driver.findElement(By.cssSelector(".macbook-air .typography-hero-product-headline")).getText(), is("MacBook Air"));
        driver.findElement(By.linkText("iPad")).click();
        driver.findElement(By.cssSelector(".flipped > .text-content")).click();
        driver.findElement(By.linkText("iPhone")).click();
        driver.findElement(By.cssSelector(".tile-iphone-14 .copy-wrapper")).click();
        driver.findElement(By.cssSelector(".section-wrapper:nth-child(1) .hero-eyebrow-image")).click();
        driver.findElement(By.cssSelector(".section-wrapper:nth-child(1) .hero-eyebrow-image")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".section-wrapper:nth-child(1) .hero-eyebrow-image"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.cssSelector(".links-stacked:nth-child(7) .icon-copy")).click();
        assertThat(driver.findElement(By.linkText("iPhone SE")).getText(), is("iPhone SE"));
        driver.findElement(By.linkText("Especificações")).click();
        driver.findElement(By.linkText("Watch")).click();
        driver.findElement(By.cssSelector(".section-wrapper")).click();

        driver.findElement(By.linkText("AirPods")).click();
        driver.findElement(By.cssSelector(".section-airpods-3rd-gen .section-tile-wrapper")).click();
        driver.findElement(By.cssSelector(".third-gen-new-update > .hero-headline")).click();
        driver.findElement(By.cssSelector(".third-gen-new-update > .hero-headline")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".third-gen-new-update > .hero-headline"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.cssSelector(".third-gen-new-update > .hero-headline")).click();
        driver.findElement(By.cssSelector(".third-gen-new-update:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector(".third-gen-new-update > .hero-headline")).getText(), is("AirPods"));
        driver.findElement(By.linkText("TV e Casa")).click();
        driver.findElement(By.cssSelector(".typography-hero-headline")).click();
        driver.quit();
        System.out.println("Fim do Test! @Developer Valmir Junior");
    }

}
