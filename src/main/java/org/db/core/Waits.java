package org.db.core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Waits {
    private WebDriver driver;
    private WebDriverWait wait;

    public Waits(WebDriver driver)
    {
        this.driver = driver;
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(TimeoutException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
    }

    public WebElement visibilityOfElement(By by)
    {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement loadElement(WebElement element)
    {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
