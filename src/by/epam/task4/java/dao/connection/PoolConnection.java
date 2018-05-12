package by.epam.task4.java.dao.connection;
import java.sql.*;
import java.util.Locale;
import java.util.ResourceBundle;
public class PoolConnection {
    private static Connection conn;
    public static PoolConnection db;
    private static String url;
    private static String driver;
    private static String user;
    private static String pass;
    private static String base;
    private PoolConnection()  {
        Locale locale = new Locale("en", "US");
        ResourceBundle resource = ResourceBundle.getBundle("by.epam.task4.resources.database.connection", locale);
        this.url = resource.getString("mysql.url");
        this.driver = resource.getString("mysql.driver");
        this.user = resource.getString("mysql.user");
        this.pass = resource.getString("mysql.password");
        this.base = resource.getString("mysql.schema");
    }

    private Connection createConn() {
        try {
            Class.forName(driver).newInstance();
            this.conn = DriverManager.getConnection(url+base,user,pass);
            System.out.println(url+base+user+pass);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return this.conn;
    }

    private static Connection getConn() {
        return conn;
    }
    public static synchronized Connection getConnection() {
        if ( db == null ) {
            db = new PoolConnection();
            return db.createConn();
        }
        return getConn();
    }


}
