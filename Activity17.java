import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/selects");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // On the Single Select:
        WebElement singleSelect = driver.findElement(By.id("single-select"));

        // Select the second option using the visible text
        Select select = new Select(singleSelect);
        select.selectByVisibleText("Option 2");

        // Select the third option using the index
        select.selectByIndex(2);

        // Select the fourth option using the value
        select.selectByValue("4");

        // Get all the options and print them to the console
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println("Option value: " + option.getAttribute("value") + ", Option text: " + option.getText());
        }

        // Close the browser
        driver.quit();
    }
}