package testeAutomacao.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testeAutomacao.pageObject.BasePO;

public class LoginPO extends BasePO {
    /**
     * Construtor base para criação da fabrica de elementos (PageFactory).
     * Construtor padrão para criação de uma nova instancia da pagina de login.
     *
     * @param driver -- Driver da página de login.
     */

    @FindBy(id = "menuUser")
    public static WebElement btnLogin;

    @FindBy(css = "body > login-modal > div > div > div.login.ng-scope > sec-form > sec-view:nth-child(1) > div > input")
    public static WebElement inputUsuario;

    @FindBy(css = "body > login-modal > div > div > div.login.ng-scope > sec-form > sec-view:nth-child(2) > div > input")
    public static WebElement inputSenha;

    @FindBy(id = "sign_in_btn")
    public static WebElement btnLogar;

    /**
     * Elemento capturado para validar se o usuário logado é o correto
     */
    @FindBy(css = "#menuUserLink > span")
    public static WebElement spanUsuario;

    public LoginPO(WebDriver driver) {
        super(driver);
    }

    public static void executarAcaoDeLogar() throws InterruptedException {
        Thread.sleep(5000);
        btnLogin.click();
        Thread.sleep(3000);
        escrever(inputUsuario,"JayGatsby");
        escrever(inputSenha,"Teste@123");

        btnLogar.click();
    }
}