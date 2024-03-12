import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class SeleniumExample {
        public static void main(String[] args) {

            WebDriver driver = new FirefoxDriver();


            driver.get("https://v1.training-support.net/selenium/target-practice");


            System.out.println("Page title: " + driver.getTitle());


            WebElement header3 = driver.findElement(By.xpath("//h3[3]"));
            System.out.println("3rd header text: " + header3.getText());

            WebElement header5 = driver.findElement(By.xpath("//h3[5]"));
            String color = header5.getCssValue("color");
            System.out.println("5th header color: " + color);


            WebElement violetButton = driver.findElement(By.cssSelector("button.btn-violet"));
            System.out.println("Violet button classes: " + violetButton.getAttribute("class"));


            WebElement greyButton = driver.findElement(By.cssSelector("button.btn-grey"));
            System.out.println("Grey button text: " + greyButton.getText());


            driver.quit();
        }
    }

