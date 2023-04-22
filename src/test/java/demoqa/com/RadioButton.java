package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesRadioButtonLabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        boolean isEnabled = yesRadioButtonLabel.isEnabled();
        if (isEnabled){
            yesRadioButtonLabel.click();
            System.out.println(isEnabled);
        }
        Thread.sleep(3000);
        WebElement yesRadioButton=driver.findElement(By.id("yesRadio"));

        boolean isSelected=yesRadioButton.isSelected();
        if (isSelected){
            System.out.println(isSelected);
        }

        WebElement output=driver.findElement(By.cssSelector("p.mt-3"));
        System.out.println(output.getText());

        WebElement noRadioButton=driver.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled());

        driver.close();
    }
}
