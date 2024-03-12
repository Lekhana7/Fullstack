import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PageInteractions {
        public static void main(String[] args) {
            //System.setProperty("webdriver.firefox.driver", "path/to/Firefoxdriver");
            WebDriver driver = new FirefoxDriver();

            driver.get("https://v1.training-support.net/selenium/input-events");

            System.out.println("Page title: " + driver.getTitle());

            WebElement inputField = driver.findElement(By.id("cube"));


            inputField.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.chord(Keys.SHIFT, "A"));


            inputField.sendKeys(Keys.chord(Keys.CONTROL, "c"));

            driver.quit();
        }
    }
