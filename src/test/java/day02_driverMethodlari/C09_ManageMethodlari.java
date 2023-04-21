package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        /*
        Bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yuklenme suresine ihtiyac vardir.
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir.
        implicitlyWait bie sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        maksimum sureyi belirleme olanagi tanir.
         */
        driver.close();
    }
}
