package org.db.pages;

import org.db.core.Waits;
import org.db.pages.elementMap.TransferPageElementMap;
import org.openqa.selenium.WebDriver;

public class TransferPage extends TransferPageElementMap {
    private WebDriver driver;

    private Waits wait;

    public TransferPage(WebDriver driver){
        this.driver = driver;
        wait = new Waits(driver);
    }

    @Override
    public void loadPage() {wait.visibilityOfElement(title);}

    @Override
    public boolean isLoaded() {
        return  isDisplayed(title) &&
                isDisplayed(accountNumber) &&
                isDisplayed(btnSubmit);
    }


    public TransferPage typeAccountNumber(String value, String secondValue) throws InterruptedException {
        Thread.sleep(1000);
        find(accountNumber).clear();
        find(digit).clear();
        fillField(accountNumber, value);
        fillField(digit, secondValue);
        return this;
    }
    public TransferPage typeAccountTransferValue(String value)
    {
        find(transferValue).clear();
        fillField(transferValue, value);
        return this;
    }
    public TransferPage typeDescription(String value)
    {
        find(description).clear();
        fillField(description, value);
        return this;
    }

    public TransferPage clickSubmit()
    {
        find(btnSubmit).click();
        return this;
    }
    public void clickBtnExit() throws InterruptedException {
        Thread.sleep(1000);
        find(btnExit).click();
    }
    public TransferPage clickBtnCloseModal() throws InterruptedException {
        Thread.sleep(1000);
        find(btnCloseModal).click();
        return this;
    }
    public void clickBtnVoltar() throws InterruptedException{
        Thread.sleep(1000);
        find(btnBack).click();
    }
}
