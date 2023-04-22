package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        // Practice Form
        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckBox.isEnabled(); // bu element tiklanabiliyor mu? true yada false donecek.
        System.out.println(isEnabled);

        WebElement sportcheckboxLabel = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        try {
            sportCheckBox.click();
        } catch (ElementClickInterceptedException e) {
            sportcheckboxLabel.click();
        }
        boolean isselected=sportCheckBox.isSelected(); // secili olup olmadigini?
        System.out.println(isselected);
    }
}
