import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLJDBCUtil {

    public static Connection getConnection() throws SQLException {
        String url       = "jdbc:mysql://localhost:3306/mysqljdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user      = "root";
        String password  = "1234";
        Connection conn = null;
        // create a connection to the database
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
}
