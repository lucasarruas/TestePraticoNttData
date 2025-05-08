package testeAutomacao.page;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class PopularTabela {
    private static final String API_URL = "https://n8n.apptrix.app/webhook/a1841391-56ad-4a75-bfeb-e005b673c756";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/banco_teste_automacao";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "125429";

    //public static void main(String[] args) {
        //String resultado = popularBanco();
        //System.out.println(resultado);
    //}
    public PopularTabela(){}

    public static String popularBanco() {
        try (Connection dbConn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            //System.out.println("Conectado ao banco com sucesso!");

            // Obtendo os dados da API
            String jsonResponse = getApiData();
            if (jsonResponse == null || jsonResponse.isEmpty()) {
                return "Erro: Não foi possível obter os dados da API.";
            }

            JSONArray jsonArray = new JSONArray(jsonResponse);
            String sql = "INSERT INTO usuarios (id, name, email, userName, Password) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = dbConn.prepareStatement(sql)) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject obj = jsonArray.getJSONObject(i);
                    stmt.setString(1, obj.optString("id", "N/A"));
                    stmt.setString(2, obj.optString("name", "Sem Nome"));
                    stmt.setString(3, obj.optString("email", "Sem Email"));
                    stmt.setString(4, obj.optString("userName", "Sem Usuário"));
                    stmt.setString(5, obj.optString("Password", "Sem Senha"));
                    stmt.executeUpdate();
                }
                return "Dados inseridos com sucesso!";
            } catch (SQLException e) {
                return "Erro ao inserir dados no banco: " + e.getMessage();
            }
        } catch (SQLException e) {
            return "Erro ao conectar ao MySQL: " + e.getMessage();
        }
    }

    private static String getApiData() {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                return response.toString();
            }
        } catch (Exception e) {
            return null;
        }
    }
    public String fazerInsert() throws SQLException {
        Connection dbConn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        String sql = "INSERT INTO usuarios (id, name, email, userName, Password) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = dbConn.prepareStatement(sql)) {
                stmt.setString(1, "1234");
                stmt.setString(2, "Lucas");
                stmt.setString(3, "lucasarruas@gmail.com");
                stmt.setString(4, "admin");
                stmt.setString(5, "admin");
                stmt.executeUpdate();
                return "Dados inseridos com sucesso!";
            }catch (Exception e){
            return "Usuário já existe no banco de dados!";
        }
            //return "Dados inseridos com sucesso!";
        }

    public String deletarUsuario(String idUsuario) {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, idUsuario);
            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Usuário deletado com sucesso!";
            } else {
                return "Nenhum usuário encontrado com esse ID.";
            }
        } catch (SQLException e) {
            return "ID informado não existe na tabela!";
        }
    }
}





