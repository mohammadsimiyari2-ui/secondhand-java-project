import database.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        System.out.println(System.getProperty("user.dir"));
        Connection connection = DatabaseManager.getConnection();

        System.out.println("Connected Successfully!");
    }
}
