package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Work_01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");

        // 2-arama kutusunu locate edilim
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        // 3-"Samsung headphones" ile arama yapalim
        searchBox.sendKeys("Samsung headphones"+ Keys.ENTER);

        // 4-bulunan sonuc sayisini yazdiralim
        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        System.out.println(sonucSayisi.getText());

        // 5-ilk urunu tiklayalim
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();


        // 6-sayfadaki tum basliklari yazdiralim
        System.out.println("Sayfa Title : "+driver.getTitle());


        driver.close();


    }
}
