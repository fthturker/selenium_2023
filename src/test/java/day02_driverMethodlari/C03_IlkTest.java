package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
         1- https://www.amazon.com url'ine gidin
         2- basligin Amazon kelimesi icerdigini test edin
         3- Url'in "https://www.amazon.com" a esit oldugunu test edin
         4- sayfayi kapatin
         */

        // 1- https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");
        // 2- basligin Amazon kelimesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILD");
        }
        System.out.println("Actual Title : " + driver.getTitle());
        // 3- Url'in "https://www.amazon.com/" a esit oldugunu test edin
        String actualUrl = driver.getCurrentUrl();
        String arananUrl = "https://www.amazon.com/";
        if (actualUrl.equals(arananUrl)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url testi FAILD");
        }
        System.out.println("Actual Url : " + driver.getCurrentUrl());
        // 4- sayfayi kapatin
        driver.close();
    }
}


