package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Css_Selector {
    public static void main(String[] args) throws InterruptedException {
        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("https://signup.heroku.com/");

        // firstname locate
        WebElement firstName=driver.findElement(By.cssSelector("input[id='first_name']"));
        firstName.sendKeys("Fatih");

        // lastname locate
        WebElement lastName=driver.findElement(By.cssSelector("input[id='last_name']"));
        lastName.sendKeys("Turker");

        // Email Adresses locate
        WebElement emailAdresses=driver.findElement(By.cssSelector("input[id='email']"));
        emailAdresses.sendKeys("fthturker80@gmail.com");

        // Company Name locate
        WebElement companyName=driver.findElement(By.cssSelector("input[id='company']"));
        companyName.sendKeys("I2I SYSTEM");

        // Role
        WebElement role=driver.findElement(By.xpath("//option[@value='professional_developer']"));
        role.click();

        // Contry locate
        WebElement country=driver.findElement(By.xpath("//option[@value='Turkey']"));
        country.click();

        // development language locate
        WebElement developmentLanguage=driver.findElement(By.xpath("//option[@value='java']"));
        developmentLanguage.click();

        Thread.sleep(1500);

        // Create An Count
        WebElement createAccount=driver.findElement(By.xpath("//input[@name='commit']"));
        createAccount.click();


    }
}
