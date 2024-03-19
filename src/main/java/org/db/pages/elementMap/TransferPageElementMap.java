package org.db.pages.elementMap;

import org.db.core.BasePage;
import org.openqa.selenium.By;

public class TransferPageElementMap extends BasePage {
    protected By title = By.xpath("//p[contains(@class, 'transfer__TextInformation-sc-1yjpf2r-7') and contains(text(), 'Realize transferência de valores entre contas BugBank com taxa')]");

    protected By accountNumber = By.name("accountNumber");
    protected By digit = By.name("digit");
    protected By transferValue = By.name("transferValue");
    protected By description = By.name("description");
    protected By btnSubmit = By.xpath("//*[text()= 'Transferir agora']");
    protected By btnExit = By.id("btnExit");
    protected By btnCloseModal = By.id("btnCloseModal");
    protected By btnBack = By.id("btnBack");
}
