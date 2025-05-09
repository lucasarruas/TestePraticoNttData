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

    @FindBy(css = "#toolTipCart > div > table > tfoot > tr:nth-child(1) > td:nth-child(2) > span")
    public static WebElement valorTotalCarrinho;

    @FindBy(css = "#product > td:nth-child(3) > p")
    public static WebElement valorTotalCheckOut;

    @FindBy(css = "#checkOutButton")
    public static WebElement btnCheckOut2;

    @FindBy(css="#shoppingCart > table > tbody > tr > td:nth-child(6) > span > a.remove.red.ng-scope")
    public static WebElement linkRemoveProduto;

    @FindBy(css = "body > div.uiview.ng-scope > section > article > h3 > span")
    public static WebElement quantidadeItensCarrinho;

    @FindBy(css = "#shoppingCart > table > thead > tr > th.imgHeader")
    public static WebElement clicarEmBranco;

    @FindBy(css = "#toolTipCart > div > table > tfoot > tr:nth-child(1) > td:nth-child(1) > span > label")
    public static WebElement adicionado1Elemento;

    public ControllerProdutoPO(WebDriver driver) { super(driver);    }


}


