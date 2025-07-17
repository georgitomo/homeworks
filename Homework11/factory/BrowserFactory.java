package org.example.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserFactory {
    private static WebDriver driver;
    public static WebDriver startBrowser(String browserName) {
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\abi99\\Desktop\\chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        // Future browsers can be added here (e.g., Firefox, Edge, etc.)

        if (driver != null) {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }

    public static void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
