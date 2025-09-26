package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utility {

    public static WebDriver webDriver;

    // membuka google chrome
    public static void startWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.saucedemo.com/v1/index.html");
    }

    // menutup google chrome
    public static void quitDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
