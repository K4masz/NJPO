import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by K4masz on 2018-01-18.
 */
public class DBConnection {
    private static DBConnection inst;

    private Connection connection;
    private String JDBC_Driver = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost:3306/addressbook?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String USER = "java";
    private String PASS = "java123";

    private DBConnection() {
        try {

            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connection established.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DBConnection getInstance() {
        if (inst == null)
            return new DBConnection();
        else
            return inst;
    }

    public Connection getConnection() {
        return connection;
    }
}