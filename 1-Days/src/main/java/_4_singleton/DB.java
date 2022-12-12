package _4_singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/sample";
    private final String username = "sa";
    private final String password = "sa";

    private Connection con = null;
    public Connection conn() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Success");
        }catch (Exception ex) {
            System.err.println("Connection Error : " + ex);
        }
        return con;
    }

    public void close() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Close Success");
            }
        }catch (Exception ex) {
            System.err.println("Close Error : " + ex);
        }
    }

}
