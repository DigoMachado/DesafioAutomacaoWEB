package org.db.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BasePage extends DriverManager{

    protected BaseTest test;

    protected BasePage()
    {
        super();
    }
    public BasePage(BaseTest test)
    {
        this.test = test;
    }

    public void loadPage() {}

    public boolean isLoaded(){
        return false;
    }
    protected boolean isDisplayed(By locator)
    {
        try {
            WebElement el = find(locator);
            return el.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    protected WebElement find(By by)
    {
        return driver.findElement(by);
    }

    protected void fillField(By field, String value)
    {
        find(field).sendKeys(value);
    }


}
