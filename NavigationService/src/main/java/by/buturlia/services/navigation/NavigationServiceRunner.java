package by.buturlia.services.navigation;


import by.buturlia.services.navigation.dao.CityDAOImpl;
import by.buturlia.services.navigation.db.MySqlConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class NavigationServiceRunner {

    public static void main(String[] args) throws SQLException {

        Connection connection = MySqlConnection.getConnection();
        System.out.println("Check connection " + connection.isClosed());
    }


}

