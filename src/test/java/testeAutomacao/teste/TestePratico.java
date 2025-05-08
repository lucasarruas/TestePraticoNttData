package testeAutomacao.teste;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import testeAutomacao.page.PopularTabela;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestePratico {

    @org.junit.Test
    public void cenario1(){
        PopularTabela popula = new PopularTabela();
        String resultado = popula.popularBanco();
        //System.out.println(resultado);
        assertEquals("Dados inseridos com sucesso!", resultado);
    }

    @org.junit.Test
    public void cenario2() throws SQLException {
        PopularTabela popula = new PopularTabela();
        String resultado = popula.fazerInsert();
        //System.out.println(resultado);
        assertEquals("Dados inseridos com sucesso!", resultado);
    }

    @org.junit.Test
    public void cenario3() throws SQLException {
        PopularTabela popula = new PopularTabela();
        String resultado = popula.fazerInsert();
        //System.out.println(resultado);
        assertEquals("Usuário já existe no banco de dados!", resultado);
    }

    @org.junit.Test
    public void cenario4() throws SQLException {
        PopularTabela popula = new PopularTabela();
        assertEquals("Nenhum usuário encontrado com esse ID.", popula.deletarUsuario("123"));
    }
}
