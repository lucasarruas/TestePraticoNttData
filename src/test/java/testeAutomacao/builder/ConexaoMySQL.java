package testeAutomacao.builder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/banco_teste_automacao";
    private static final String USUARIO = "root";
    private static final String SENHA = "125429";

    public Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectado ao MySQL com sucesso!");
            return conexao;
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao MySQL: " + e.getMessage());
            return null;
        }
    }
}

