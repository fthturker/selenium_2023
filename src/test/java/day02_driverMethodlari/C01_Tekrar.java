package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.techproeducation.com");
        Thread.sleep(3000);
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        driver.close();
    }
}
