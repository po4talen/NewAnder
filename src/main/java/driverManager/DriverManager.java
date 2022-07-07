package driverManager;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverManager {

    private static DriverManager instance;
    @Getter
    private static WebDriver driver;


    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            initDriver();
        }
        return driver;
    }
    private static void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        instance = new DriverManager();
    }

    public void killDriver() {
        driver.close();
    }
}
