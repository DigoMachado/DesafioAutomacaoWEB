package org.db.pages;

import org.db.core.Waits;
import org.db.pages.elementMap.LoginPageElementMap;

import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginPageElementMap {
    private WebDriver driver;

    private Waits waits;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        waits = new Waits(driver);
    }

    @Override
    public void loadPage() {waits.visibilityOfElement(title);}

    @Override
    public boolean isLoaded() {
        return isDisplayed(title) &&
               isDisplayed(email) &&
               isDisplayed(password);
    }

    public LoginPage typeUserEmail(String value)
    {
        fillField(email, value);
        return this;
    }
    public LoginPage typePassword(String value)
    {
        fillField(password, value);
        return this;
    }

    public void clickAccess()
    {
        find(access).click();
    }
    public void clickRegister() throws InterruptedException {
        find(register).click();
    }
}
