package principal;

import persistencia.DatabaseConnection;

/**
 *
 * @author GLAUFER
 */
public class Main {

    public static void main(String[] args) {
        DatabaseConnection.getConnection();
    }
    
}
