package org.db.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    protected static ChromeOptions options = new ChromeOptions();
    protected static WebDriver driver = new ChromeDriver(options);

    public static WebDriver getDriver()
    {
        driver.manage().window().maximize();
        return driver;
    }

    public static void quitDriver()
    {
        if(driver != null)
        {
            driver.quit();
            driver = null;
        }
    }
}
