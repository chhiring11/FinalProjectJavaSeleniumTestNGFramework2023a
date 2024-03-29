package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver launchGivenBrowser(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }
        if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new ChromeDriver();
        }
        if (browserName.equalsIgnoreCase("Safari")) {
            driver = new ChromeDriver();
        }
        if (browserName.equalsIgnoreCase("Edge")) {
            driver = new ChromeDriver();
        } else {
            System.out.println("Invalid Browser name");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }




}

