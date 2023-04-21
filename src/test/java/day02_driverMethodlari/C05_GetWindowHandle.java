package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_GetWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());
        driver.close();
        // 6DF80AED106968E236AB7AFE8F7AC93C
        // benzersiz olarak acilan window'a ait hashcode'unu verir.
    }
}
