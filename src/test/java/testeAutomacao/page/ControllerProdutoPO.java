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

    @FindBy(id = "autoComplete")
    public static WebElement inputPesquisa;

    @FindBy(id = "menuSearch")
    public static WebElement btnPesquisa;

    @FindBy(css = "#output > div > div.top6Products > a.product.ng-scope")
    public static WebElement selecionaProduto;

    @FindBy(css = "#bunny.productColor.ng-scope.BLACK")
    public static WebElement alterarCor;

    @FindBy(css = "#productProperties > div.smoolMargin > e-sec-plus-minus > div > div.plus")
    public static WebElement alteraQuantidade;

    public ControllerProdutoPO(WebDriver driver) { super(driver);    }


}


