package org.db.pages;

import org.db.core.Waits;
import org.db.pages.elementMap.HomePageElementMap;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomePageElementMap {
    private WebDriver driver;

    private Waits wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        wait = new Waits(driver);
    }

    @Override
    public void loadPage() {wait.visibilityOfElement(text);}

    @Override
    public boolean isLoaded() {
        return  isDisplayed(btnTransferencia) &&
                isDisplayed(text) &&
                isDisplayed(btnExtrato) &&
                isDisplayed(btnExit);
    }

    public void clickBtnTransferencia() throws InterruptedException {
        Thread.sleep(1000);
        find(btnTransferencia).click();
    }
    public HomePage clickBtnExtrato() throws InterruptedException {
        Thread.sleep(1000);
        find(btnExtrato).click();
        return this;
    }

    public void clickBtnExit() throws InterruptedException {
        Thread.sleep(1000);
        find(btnExit).click();
    }
    public String getAccountNumber() throws InterruptedException {
        Thread.sleep(1000);
        return find(accountNumber).getText();
    }


}
