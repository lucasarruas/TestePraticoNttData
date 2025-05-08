package testeAutomacao.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testeAutomacao.pageObject.BasePO;

public class ControllerProdutoPO extends BasePO {

    @FindBy(css = "#see_offer_btn")
    public static WebElement btnOferta;

    @FindBy(id = "tabletsImg")
    public static WebElement btnSelecionaOpcaoTablet;

    @FindBy(css="#productProperties > div.fixedBtn > button")
    public static WebElement btnAdicionarCarrinho;

    @FindBy(css = "#menuCart > path")
    public static WebElement btnCarrinho;

    @FindBy(id = "checkOutPopUp")
    public static WebElement btnCheckOut;

    @FindBy(id = "next_btn")
    public static WebElement btnAvançar;

    @FindBy(id = "pay_now_btn_SAFEPAY")
    public static WebElement btnPagarAgora;

    @FindBy(id = "trackingNumberLabel")
    public static WebElement labelCodigoRastreamento;

    @FindBy(id = "orderNumberLabel")
    public static WebElement labelNumeroOrdem;

    public ControllerProdutoPO(WebDriver driver) {
        super(driver);
    }


}


