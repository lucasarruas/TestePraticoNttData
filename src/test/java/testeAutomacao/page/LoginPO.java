package testeAutomacao.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testeAutomacao.pageObject.BasePO;

public class LoginPO extends BasePO {
    /**
     * Construtor base para criação da fabrica de elementos (PageFactory).
     *Construtor padrão para criação de uma nova instancia da pagina de login.
     * @param driver -- Driver da página de login.
     */

        @FindBy(id = "menuUserSVGPath")
        public static WebElement btnLogin;

}
