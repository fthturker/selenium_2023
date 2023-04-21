package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // browser'i tam sayfa yapar.

        driver.get("https://www.amazon.com"); // gitmel istedigimiz sayfaya goturur
        System.out.println("actual Title : " + driver.getTitle());  // sayfanin basligini dondurur
        System.out.println("Actual URL : " + driver.getCurrentUrl()); // sayfanin Url'ni dondurur
        driver.close(); // sayfayi kapatir

    }
}
