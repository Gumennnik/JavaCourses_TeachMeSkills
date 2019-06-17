package by.buturlia.services.navigation.dao;


import by.buturlia.services.navigation.db.MySqlConnection;
import by.buturlia.services.navigation.entities.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CityDAOImpl implements CityDAO {

    private static final String CREATE_CITY = "INSERT INTO cities VALUES (null , ? , ? , ? , ? , ? , ?)";
    private static final String SELECT_ALL_CITIES = "SELECT * FROM cities";
    private static final String UPDATE = "UPDATE cities SET name = ? WHERE id = ?";

    @Override
    public void create(City city) {
        try (Connection connection = MySqlConnection.getConnection()) {
            //TODO: NamedParameterStatement



            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_CITY);
            preparedStatement.setString(1, city.getCityName());
            preparedStatement.setDouble(2, city.getLatitude());
            preparedStatement.setDouble(3, city.getLongitude());
            preparedStatement.setBoolean(4, city.isHasGroundRoad());
            preparedStatement.setBoolean(5, city.isHasAirport());
            preparedStatement.setBoolean(6 , city.isHasSeaport());


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public City getCitiesByName() {
        return null;
    }

    @Override
    public void update(City city) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<City> get() {
        return null;
    }

    //    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("JDBC driver not found");
//            e.printStackTrace();
//        }
//
//        String url = "jdbc:mysql://localhost:3306/navigation_service";
//        String user = "root";
//        String password = "root";
//
//        try (Connection connection = DriverManager.getConnection(url, user, password)){
//
//            String sql = "INSERT INTO cities VALUES (null , ? , ? , ? , ? , ? , ?)";
//
//            connection.setAutoCommit(false);
//
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, "Boston");
//            preparedStatement.setDouble(2, 243.0);
//            preparedStatement.setDouble(3, 12.0);
//            preparedStatement.setBoolean(4, true);
//            preparedStatement.setBoolean(5, true);
//            preparedStatement.setBoolean(6 , true);
//
//
//            preparedStatement.execute();
//
//            connection.commit();
//
//
//
//        } catch (SQLException e) {
//
//            System.out.println("SQL exception found!!!!");
//            e.printStackTrace();
//        }
//
//    }

}
