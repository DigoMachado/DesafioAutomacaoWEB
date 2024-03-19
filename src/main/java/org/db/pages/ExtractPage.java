package org.db.pages;

import org.db.core.Waits;
import org.db.pages.elementMap.ExtractPageElementMap;
import org.openqa.selenium.WebDriver;

public class ExtractPage extends ExtractPageElementMap {
    private WebDriver driver;

    private Waits wait;

    public ExtractPage(WebDriver driver){
        this.driver = driver;
        wait = new Waits(driver);
    }

    @Override
    public void loadPage() {wait.visibilityOfElement(currentBalance);}

    @Override
    public boolean isLoaded() {
        return  isDisplayed(currentBalance) &&
                isDisplayed(transferCard);
    }

    public String getCurrentBalance() throws InterruptedException {
        Thread.sleep(1000);
        return find(currentBalance).getText();
    }
    public boolean isDisplayedTransferCard() throws InterruptedException {
        Thread.sleep(1000);
        return find(transferCard).isDisplayed();
    }
    public String getTransferCardDescription() throws InterruptedException {
        Thread.sleep(1000);
        return find(transferDescription).getText();
    }
    public String getTransferCardWithdrawalValue() throws InterruptedException {
        Thread.sleep(1000);
        return find(transferWithdrawal).getText();
    }
    public String getTransferCardInputValue() throws InterruptedException {
        Thread.sleep(1000);
        return find(transferInput).getText();
    }
    public void clickBtnExit() throws InterruptedException {
        Thread.sleep(1000);
        find(btnExit).click();
    }
}
