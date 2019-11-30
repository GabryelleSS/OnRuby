package br.senac.onRuby.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

class ConnectionUtils {
    public static Connection getConnection() throws Exception {
        Connection connection = null;
        
        String dbURL = "jdbc:mysql://localhost:3306/pi";
        
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "admin");
        properties.put("serverTimezone", "UTC");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(dbURL, properties);
        
        return connection;
    }
}
