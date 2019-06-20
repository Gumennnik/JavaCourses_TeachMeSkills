package by.buturlia.services.navigation;


import by.buturlia.services.navigation.db.MySqlConnection;
import by.buturlia.services.navigation.entities.cities.dao.CityDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class NavigationServiceRunner {

    public static void main(String[] args) throws SQLException {

//        Connection connection = MySqlConnection.getConnection();
//        System.out.println("Check connection " + connection.isClosed());

        CityDAO cityDAO = new CityDAO();
        cityDAO.get();
    }


}

