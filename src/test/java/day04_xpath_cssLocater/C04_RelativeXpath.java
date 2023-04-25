package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_RelativeXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //Berlin'i 3 farkli relative locator ile locate edin

        WebElement nycB = driver.findElement(By.id("pid3_thumb"));
        WebElement bostonB = driver.findElement(By.id("pid6_thumb"));
        WebElement sailorB = driver.findElement(By.id("pid11_thumb"));

        // Relative locator'larin dogru calistigini test edin

        WebElement berlin = driver.findElement(RelativeLocator.with(By.tagName("img"))
                .below(nycB).above(sailorB).toRightOf(bostonB));

        System.out.println(berlin.getAttribute("id"));
        driver.close();

    }
}
