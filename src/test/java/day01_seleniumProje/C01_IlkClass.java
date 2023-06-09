package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /*
         en ilkel haliyle bir otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan webdriver'in
         yerini gostermemiz gerekir.
         bunun icin Java kutuphanesinden System.setProperty() methodu kullaniriz
         setProperty() --> bazi ayarlari olusturuyor.
         method 2 parametre istemektedir.
         ilki kullanacagumız driver : webdriver.chrome.driver
         ikincisi ise bu driverin fiziki yolu :  src/resources/drivers/chromedriver.exe
         */
        System.setProperty("webdriver.chrome.Driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        driver.close();

    }
}
