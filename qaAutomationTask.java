import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AutomationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://sg-app.abouv.com/welcome");

            driver.findElement(By.xpath("//a[contains(text(), 'Sign up')]")).click();

            WebElement phoneNumberField = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
            phoneNumberField.sendKeys("7994662273");

            driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();
            driver.findElement(By.xpath("//div[contains(text(), 'Social Media')]")).click();
            driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();
            driver.findElement(By.xpath("//div[contains(text(), 'Exploring Opportunities')]")).click();
            driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();
            driver.findElement(By.xpath("//div[contains(text(), 'Job Opportunities')]")).click();
            driver.findElement(By.xpath("//div[contains(text(), 'Paid Internship')]")).click();
            driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();
            driver.findElement(By.xpath("//button[contains(text(), 'Continue with Email')]")).click();

            WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
            emailField.sendKeys("shalu20192001@gmail.com");

            driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();
            WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
            firstNameField.sendKeys("Shalima");

            WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
            lastNameField.sendKeys("S");

            WebElement pinCodeField = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
            pinCodeField.sendKeys("691011");

            driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}