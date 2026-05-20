package employeeManagement1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String url =
            "jdbc:postgresql://localhost:5432/empdetails";

    private static final String username =
            "postgres";

    private static final String password =
            "1234";

    public static Connection getConnection() {

        try {

            Class.forName("org.postgresql.Driver");

            return DriverManager.getConnection(
                    url,
                    username,
                    password
            );

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }
}
