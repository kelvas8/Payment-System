package by.epam.task4.dao.resources;

import java.sql.*;
import java.util.ResourceBundle;

public class PoolConnection {
    private static PoolConnection db;
    public Connection conn;
    private Statement statement;
    private PoolConnection() {
        ResourceBundle resource = ResourceBundle.getBundle("/properties/database");
        String url = resource.getString("mysql.host");
        String driver = resource.getString("mysql.driver");
        String user = resource.getString("mysql.user");
        String pass = resource.getString("mysql.password");
        String base = resource.getString("mysql.schema");

        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+base,user,pass);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized PoolConnection getInsert() {
        if ( db == null ) {
            db = new PoolConnection();
        }
        return db;
    }

    public ResultSet query(String query) throws SQLException {
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;

    }
}
