import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class newApple2Test {
    private WebDriver driver2;

    @Test
    public void NewApple2Test() {
        System.setProperty("webdriver.chrome.driver" , "/home/neto/IdeaProjects/login/driver/drivers/chromedriver");
        driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.apple.com/br/");
        driver2.findElement(By.linkText("Só na Apple")).click();
        driver2.findElement(By.cssSelector(".link-custom > .icon-copy")).click();
        driver2.findElement(By.cssSelector(".plan-individual")).click();
        driver2.findElement(By.linkText("Experimente grátis*")).click();
        assertFalse(driver2.getCurrentUrl().contains("Experimente grátis"));
        driver2.quit();
        System.out.println("Fim do Test! @Developer Valmir Junior");
    }
}
