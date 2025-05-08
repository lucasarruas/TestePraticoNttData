package testeAutomacao.teste;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import testeAutomacao.page.ControllerProdutoPO;
import testeAutomacao.page.LoginPO;
import testeAutomacao.page.PopularTabelaUsuario;
import testeAutomacao.pageObject.BasePO;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestePratico extends BaseTest{

    private  static LoginPO loginPage;
    private static ControllerProdutoPO controleDeProdutoPage;
    String nomeProduto = "HP PAVILION 15Z TOUCH LAPTOP";

    @BeforeClass
    public  static void prepararTestes() throws InterruptedException {
        loginPage = new LoginPO(driver);
        controleDeProdutoPage = new ControllerProdutoPO(driver);
    }

    @org.junit.Test
    public void cenario1(){
        PopularTabelaUsuario popula = new PopularTabelaUsuario();
        String resultado = popula.popularBanco();
        assertEquals("Dados inseridos com sucesso!", resultado);
    }

    @org.junit.Test
    public void cenario1_2() throws SQLException {
        PopularTabelaUsuario popula = new PopularTabelaUsuario();
        String resultado = popula.fazerInsert();
        assertEquals("Dados inseridos com sucesso!", resultado);
    }

    @org.junit.Test
    public void cenario1_3() throws SQLException {
        PopularTabelaUsuario popula = new PopularTabelaUsuario();
        String resultado = popula.fazerInsert();
        assertEquals("Usuário já existe no banco de dados!", resultado);
    }

    @org.junit.Test
    public void cenario1_4() throws SQLException {
        PopularTabelaUsuario popula = new PopularTabelaUsuario();
        assertEquals("Nenhum usuário encontrado com esse ID.", popula.deletarUsuario("123"));
    }

    @org.junit.Test
    public void cenario2() throws InterruptedException {
        LoginPO.executarAcaoDeLogar();
        Thread.sleep(2000);
        driver.get("https://advantageonlineshopping.com/#/product/3");
        Thread.sleep(3000);
        ControllerProdutoPO.btnAdicionarCarrinho.click();
        driver.get("https://advantageonlineshopping.com/#/shoppingCart");
        Thread.sleep(2000);
        ControllerProdutoPO.btnCheckOut.click();
        Thread.sleep(2000);
        ControllerProdutoPO.btnAvançar.click();
        Thread.sleep(2000);
        ControllerProdutoPO.btnPagarAgora.click();
        Thread.sleep(2000);
        Boolean codigoRastreamento = ControllerProdutoPO.labelCodigoRastreamento.getText()!="";
        Boolean numeroOrdem = ControllerProdutoPO.labelNumeroOrdem.getText()!="";
        assertEquals(true, codigoRastreamento);
        assertEquals(true, numeroOrdem);
        assertEquals("JayGatsby",LoginPO.spanUsuario.getText());

        Thread.sleep(2000);
    }

    @org.junit.Test
    public void cenario3() throws InterruptedException {
        Thread.sleep(4000);
        ControllerProdutoPO.btnPesquisa.click();
        BasePO.escrever(ControllerProdutoPO.inputPesquisa,nomeProduto);
        Thread.sleep(2000);
        ControllerProdutoPO.btnPesquisa.click();
        Thread.sleep(3000);
        ControllerProdutoPO.selecionaProduto.click();
        Thread.sleep(3000);
        ControllerProdutoPO.alterarCor.click();
        Thread.sleep(3000);
        ControllerProdutoPO.alteraQuantidade.click();
        Thread.sleep(3000);
        ControllerProdutoPO.btnAdicionarCarrinho.click();
        ControllerProdutoPO.btnAdicionarCarrinho.click();
        Thread.sleep(3000);
        ControllerProdutoPO.btnCarrinho.click();
        //ControllerProdutoPO.alterarCor.click();
        //LoginPO.executarAcaoDeLogar();
        //Thread.sleep(2000);
    }


}
