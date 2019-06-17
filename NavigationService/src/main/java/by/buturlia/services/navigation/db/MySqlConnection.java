package by.buturlia.services.navigation.db;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class MySqlConnection {

    private static String url;
    private static String user;
    private static String password;

    static  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Properties properties = new Properties();

        try {
            properties.load(new FileReader("db.env"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

}
