package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement nameElement=driver.findElement(By.id("userName"));
        nameElement.click();
        nameElement.sendKeys("Fatih");

        WebElement emailElement=driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailElement.click();
        emailElement.sendKeys("fthturker80@gmail.com");

        WebElement currentAdress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAdress.click();
        currentAdress.sendKeys("Umraniye/Istanbul");

        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Turkiye");

        WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        Thread.sleep(3000);

        /////////////////////////////
        WebElement nameText=driver.findElement(By.xpath("//p[@id='name']"));
        String name=nameText.getText();
        System.out.println(name); // Name:Fatih

        WebElement emailText=driver.findElement(By.xpath("//p[@id='email']"));
        String email=emailText.getText();
        System.out.println(email); // Email:fthturker80@gmail.com

        driver.close();
    }
}
