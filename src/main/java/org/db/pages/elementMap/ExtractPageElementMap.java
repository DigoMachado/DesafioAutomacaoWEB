package org.db.pages.elementMap;

import org.db.core.BasePage;
import org.openqa.selenium.By;

public class ExtractPageElementMap extends BasePage {
    protected By currentBalance = By.id("textBalanceAvailable");

    protected By transferCard = By.xpath("//p[@id='textTypeTransaction' and text()='Transferência enviada']");
    protected By transferWithdrawal = By.xpath("//p[@type='withdrawal' and @id='textTransferValue']");
    protected By transferInput = By.xpath("//p[@type='input' and @id='textTransferValue']");
    protected By transferDescription = By.id("textDescription");
    protected By btnExit = By.id("btnExit");
}
