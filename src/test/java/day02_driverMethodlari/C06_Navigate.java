package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
        driver.get yerine driver.navigate().to() metodunu kullaniriz
        ve sonrasinda forward(), back() veya refresh() methodlarini kullanabiliriz.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);

        // amazona geri dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden facebook gidelim
        driver.navigate().forward();

        // sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();
    }
}
