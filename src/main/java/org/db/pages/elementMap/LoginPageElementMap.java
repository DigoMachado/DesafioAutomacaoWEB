package org.db.pages.elementMap;

import org.db.core.BasePage;
import org.openqa.selenium.By;
public class LoginPageElementMap extends BasePage {
    protected String TITLE = "O banco com bugs e falhas do seu jeito";
    protected By title = By.cssSelector("pages__Title-sc-1ee1f2s-4 cFmqIK");

    protected By email = By.name("email");
    protected By password = By.name("password");

    protected By access = By.xpath("//*[text()= 'Acessar']");
    protected By register = By.xpath("//*[text()= 'Registrar']");

}
