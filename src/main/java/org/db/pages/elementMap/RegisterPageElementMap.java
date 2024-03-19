package org.db.pages.elementMap;

import org.db.core.BasePage;
import org.openqa.selenium.By;

public class RegisterPageElementMap extends BasePage {
    protected String TEXT = "Criar conta com saldo?";
    protected By text = By.xpath("//*[text()= 'Criar conta com saldo?']");

    protected By email = By.xpath("//div[@class='card__register']//input[@type='email' and @class='input__default' and @placeholder='Informe seu e-mail' and @name='email']");
    protected By name = By.name("name");
    protected By password = By.xpath("//div[@class='card__register']//input[@type='password' and @class='input__default' and @placeholder='Informe sua senha' and @name='password']");
    protected By passwordConfirmation = By.name("passwordConfirmation");
    protected By toggleAddBalance = By.id("toggleAddBalance");
    protected By submit = By.xpath("//*[text()= 'Cadastrar']");
    protected By btnCloseModal = By.id("btnCloseModal");

}
