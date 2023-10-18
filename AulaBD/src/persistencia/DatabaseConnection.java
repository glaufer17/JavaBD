package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GLAUFER
 */
public class DatabaseConnection {
    private static Connection con = null;
  
    private static void criarConexao()
    {
        String url = "jdbc:mysql://localhost:3306/conexaobd";
        String user = "root";
        String pass = "univel";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Falha ao criar banco de dados \n"+e.getMessage());
                    
        }
    }

    public static Connection getConnection()
    {
        try {
            if(con==null || con.isClosed()){
                 criarConexao();
            }
            return con;
        }catch (SQLException ex) {
            System.out.println("Falha ao obter conexao!\n"+ex.getMessage());
            return null;
        }
    }
}
