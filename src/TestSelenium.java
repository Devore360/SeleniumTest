import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class TestSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver\\GeckoDriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://rallyx.stlscca.org/contacts/");
        driver.findElement(By.name("first_name")).sendKeys("Adam");
        driver.findElement(By.name("last_name")).sendKeys("DeVore");
        driver.findElement(By.name("email")).sendKeys("devore.design@gmail.com");
        driver.findElement(By.name("textarea-430")).sendKeys("When is the next event?");
        String header = driver.getTitle();
        String expected = "Contacts - STL SCCA RALLYX";
        if(header.equalsIgnoreCase(expected)) {
            System.out.println("Test Successful");
        }
            else {
            System.out.println("Test Failure");
            driver.close();
            }
        }
    }