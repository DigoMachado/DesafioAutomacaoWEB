package org.db.pages.elementMap;

import org.db.core.BasePage;
import org.openqa.selenium.By;

public class HomePageElementMap extends BasePage {
    protected String TEXT = "Saldo em conta";
    protected By text = By.xpath("//p[@class='home__Text-sc-1auj767-9 jjmPHj'][text()='bem vindo ao BugBank :)']");

    protected By btnTransferencia = By.xpath("//a[contains(@class, 'home__Button-sc-1auj767-15') and contains(@class, 'heVuFC')]");
    protected By btnExtrato = By.id("btn-EXTRATO");
    protected By btnExit = By.id("btnExit");
    protected By accountNumber = By.xpath("//*[@id=\"textAccountNumber\"]/span");
}
