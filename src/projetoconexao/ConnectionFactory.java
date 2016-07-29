package projetoconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static java.sql.Connection getConnection() {
        Connection connection = null;
        try {
            /* Obtém o driver de conexão com o banco de dados */
            Class.forName("com.mysql.jdbc.Driver");
            /* Configura os parâmetros da conexão */
            String url = "jdbc:mysql://localhost/teste";
            String username = "root";
            String password = "123456";
            /* Tenta se conectar */
            connection = DriverManager.getConnection(url, username, password);
            /* Caso a conexão ocorra com sucesso, a conexão é retornada */
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao banco de dados.");
            return null;
        }
    }
}
