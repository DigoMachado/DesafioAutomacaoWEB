package org.db.pages;


import org.db.core.Waits;
import org.db.pages.elementMap.RegisterPageElementMap;
import org.openqa.selenium.WebDriver;


public class RegisterPage extends RegisterPageElementMap {
    private WebDriver driver;

    private Waits wait;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        wait = new Waits(driver);
    }

    @Override
    public void loadPage() {wait.visibilityOfElement(text);}

    @Override
    public boolean isLoaded() {
        return  isDisplayed(name) &&
                isDisplayed(text) &&
                isDisplayed(submit) &&
                isDisplayed(passwordConfirmation);
    }


    public RegisterPage typeUserEmail(String value)
    {
        find(email).clear();
        fillField(email, value);
        return this;
    }
    public RegisterPage typeUserName(String value)
    {
        find(name).clear();
        fillField(name, value);
        return this;
    }
    public RegisterPage typePassword(String value)
    {
        find(password).clear();
        fillField(password, value);
        return this;
    }
    public RegisterPage typePasswordConfirmation(String value)
    {
        find(passwordConfirmation).clear();
        fillField(passwordConfirmation, value);
        return this;
    }

    public RegisterPage clickAddBalance() throws InterruptedException {
        Thread.sleep(1000);
        find(toggleAddBalance).click();
        return this;
    }
    public RegisterPage clickSubmit()
    {
        find(submit).click();
        return this;
    }
    public void clickBtnCloseModal() throws InterruptedException {
        Thread.sleep(1000);
        find(btnCloseModal).click();
    }

}
