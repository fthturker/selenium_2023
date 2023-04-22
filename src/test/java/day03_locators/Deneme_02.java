package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Deneme_02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // youtube web sayfasina gidin ve sayfa basliginin "youtube" olup olmadigini dogrulayin
        // eger degilse dogru basligi (Actual Title) konsolda yazdirin
        driver.get("https://www.youtube.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title PASSED");
        } else {
            System.out.println("Title FAILED");
        }
        System.out.println(driver.getTitle());
        //sayfa Url'sinin "youtube" icerip icermedigini (contains) dogrulayin,
        //icermiyorsa dogru Url'yi yazdirin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "YouTube";
        if (actualUrl.contains(expectedTitle)) {
            System.out.println("Url PASSED");
        } else {
            System.out.println("Url FAILED");
        }
        System.out.println(driver.getCurrentUrl());

        //amazon sayfasina gidin
        driver.navigate().to("https://www.amazon.com/");
        //youtube sayfasina geri donun
        driver.navigate().to("https://www.youtube.com/");
        //sayfayi yenileyin
        driver.navigate().refresh();
        //amazon sayfasina donun
        driver.navigate().back();
        //sayfayi tam sayfa yapin
        driver.manage().window().maximize();
        // sayfa basliginin "Amazon" icerip icermedigini (contains) dogrulayin,
        //yoksa dogru basligi yazin
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Amazon";
        if (actualTitle1.contains(expectedTitle1)) {
            System.out.println("Title PASSED");
        } else {
            System.out.println("Title FAILED");
        }
        System.out.println(actualTitle1);
        //sayfa Url'sinin https://amazon.com/ olup olmadigini dogrulayin,
        //degilse dogru Url'yi yazdirin
        String actualUrl1 = driver.getCurrentUrl();
        String expectedUrl1 = "https://amazon.com/";
        if (actualUrl1.equals(expectedUrl1)) {
            System.out.println("Url PASSED");
        } else {
            System.out.println("Url FAILED");
        }
        System.out.println(actualUrl1);
        // sayfada kac link oldugunu ve yazdiralim
        List<WebElement> linksayisi = driver.findElements(By.tagName("a"));
        System.out.println(linksayisi.size());
        for (WebElement each : linksayisi
        ) {
            System.out.println(each.getText());
        }
        // sayfayi kapatin
        driver.close();
    }
}
