import org.db.core.BaseTest;
import org.db.core.Parametros;
import org.db.pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DbDesafioTest extends BaseTest {
    Parametros parametros = new Parametros();
    private WebDriver driver = getDriver();
    private LoginPage loginPage = new LoginPage(driver);
    private RegisterPage registerPage = new RegisterPage(driver);
    private HomePage homePage = new HomePage(driver);
    private TransferPage transferPage = new TransferPage(driver);
    private ExtractPage extractPage = new ExtractPage(driver);


    @Test
    public void TestCreateAccount() throws Exception
    {
        loginPage.clickRegister();
        registerPage.typeUserEmail(parametros.getFirstAccountEmail())
                .typeUserName(parametros.getFirstAccountName())
                .typePassword(parametros.getFirstAccountPassword())
                .typePasswordConfirmation(parametros.getFirstAccountPassword())
                .clickAddBalance()
                .clickSubmit().clickBtnCloseModal();

        loginPage.clickRegister();
        registerPage.typeUserEmail(parametros.getSecondAccountEmail())
                .typeUserName(parametros.getSecondAccountName())
                .typePassword(parametros.getSecondAccountPassword())
                .typePasswordConfirmation(parametros.getSecondAccountPassword())
                .clickAddBalance()
                .clickSubmit()
                .clickBtnCloseModal();
        loginPage.typeUserEmail(parametros.getSecondAccountEmail())
                .typePassword(parametros.getSecondAccountPassword())
                .clickAccess();
        String accountNumber = this.homePage.getAccountNumber();
        String[] accountParts = accountNumber.split("-");
        homePage.clickBtnExit();
        loginPage.typeUserEmail(parametros.getFirstAccountEmail())
                .typePassword(parametros.getFirstAccountPassword())
                .clickAccess();

        homePage.clickBtnTransferencia();
        transferPage.typeAccountNumber(accountParts[0], accountParts[1])
                .typeAccountTransferValue("100")
                .typeDescription("description")
                .clickSubmit()
                .clickBtnCloseModal()
                .clickBtnVoltar();
        homePage.clickBtnExtrato();
        Assertions.assertEquals("R$ 900,00",extractPage.getCurrentBalance() );
        Assertions.assertEquals("-R$ 100,00", extractPage.getTransferCardWithdrawalValue());
        extractPage.clickBtnExit();
        loginPage.typeUserEmail(parametros.getSecondAccountEmail())
                .typePassword(parametros.getSecondAccountPassword())
                .clickAccess();
        homePage.clickBtnExtrato();
        Assertions.assertEquals("R$ 100,00",extractPage.getCurrentBalance() );
        Assertions.assertEquals("R$ 100,00", extractPage.getTransferCardInputValue());
    }
}
