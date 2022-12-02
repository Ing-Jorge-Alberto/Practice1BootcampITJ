import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        /*Chrome driver*/
        //System.setProperty("webdriver.chrome.driver","/Users/jxc0622/Web Drivers/chromedriver");
        //WebDriver driver = new ChromeDriver();

        /*FireFox driver*/
        System.setProperty("webdriver.geko.driver","/Users/jxc0622/Web Drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://oscarvalerio.github.io/seleniumExercises/practice1.html");
        String browserTitle = driver.getTitle();
        System.out.println(browserTitle);
        String browserURL=driver.getCurrentUrl();
        System.out.println(browserURL);
        //Thread.sleep(2000);
        //driver.get("https://www.facebook.com/");
        //driver.navigate().back();
        driver.findElement(By.id("userField")).sendKeys("JACUserName");
        driver.findElement(By.linkText("Exercise 1 (Easy)")).click();
        driver.navigate().back();
        //driver.findElement(By.className("form-control")).sendKeys("JACPassword");
        driver.findElement(By.id("passwordField")).sendKeys("JACPassword");
        driver.findElement(By.name("buttonToSubmit")).click();
        //driver.close();
        //driver.navigate don´t wait to the page ends to load, and driver.get yes

        //Xpath structure
        //objectType[@attribute='value']

        //CSS structure
        //  objectType[attribute='value']

        driver.findElement(By.xpath("//input")).sendKeys("Hello");

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("xpathUsername");
        driver.findElement(By.xpath("//input[@id='sendCode']")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='sendCode']")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='sendCode']")).click();
        //<input type="text" class="form-control" id="userField" placeholder="Username">
        driver.close();
    }
}
