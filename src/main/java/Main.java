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
        driver.get("https://www.facebook.com/");
        driver.navigate().back();
        driver.close();
        //driver.navigate don´t wait to the page ends to load, and driver.get yes
    }
}
