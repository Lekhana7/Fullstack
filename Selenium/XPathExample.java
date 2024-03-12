
    import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class XPathExample {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "Your-Chrome-Driver-Path"); // Provide the path to your chrome driver. Make sure your chrome driver version is updated.
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://v1.training-support.net/selenium/target-practice");

            // Find the 3rd header on the page and print its text to the console
            WebElement header3 = driver.findElement(By.xpath("//h3[3]"));
            System.out.println("Text of 3rd header: " + header3.getText());

            driver.quit();
        }
    }
