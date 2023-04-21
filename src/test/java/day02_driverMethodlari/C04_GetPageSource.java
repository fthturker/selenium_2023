package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_GetPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //amazon sayfasina gidip Kaynak kodlarinda "spend less" yazdigini test edin
        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari = driver.getPageSource();
        String arananKelime = "Gateway";
        if (sayfaKaynakKodlari.contains(arananKelime)) {
            System.out.println("Kaynak kodu testi PASSED");
        } else
            System.out.println("Kaynak kodu testi FAILD");

        driver.close();
    }
}