package by.buturlia.services.navigation.entities.cities.dao;


import by.buturlia.services.navigation.db.MySqlConnection;
import by.buturlia.services.navigation.entities.CrudDAO;
import by.buturlia.services.navigation.entities.cities.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDAO implements CrudDAO<City> {

    private static final String CREATE_CITY = "INSERT INTO cities VALUES (null , ? , ? , ? , ? , ? , ?)";
    private static final String SELECT_ALL_CITIES = "SELECT * FROM cities";
    private static final String UPDATE = "UPDATE cities SET name = ? WHERE id = ?";


    public void create(City city) {
        try (Connection connection = MySqlConnection.getConnection()) {
            //TODO: NamedParameterStatement
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_CITY);
            preparedStatement.setString(1, city.getCityName());
            preparedStatement.setDouble(2, city.getLatitude());
            preparedStatement.setDouble(3, city.getLongitude());
            preparedStatement.setBoolean(4, city.isHasGroundRoad());
            preparedStatement.setBoolean(5, city.isHasAirport());
            preparedStatement.setBoolean(6, city.isHasSeaport());


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public ArrayList<City> getCitiesByName() {
//        return null;
//    }


    public void update(City city) {

    }


    public void delete(int id) {

    }


    public List<City> get() throws Exception {

        ArrayList<City> cityArrayList = new ArrayList<>();

        try(    Connection connection = MySqlConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CITIES);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {


                City city = new City();
                city.setCityId(resultSet.getInt("id"));
                city.setCityName(resultSet.getString("name"));
                city.setLatitude(resultSet.getInt("latitude"));
                city.setLongitude(resultSet.getInt("longtitude"));
                city.setHasGroundRoad(resultSet.getBoolean("hasRoad"));
                city.setHasAirport(resultSet.getBoolean("hasAirport"));
                city.setHasSeaport(resultSet.getBoolean("hasSeaport"));
                cityArrayList.add(city);
                //System.out.println(city.toString());

            }


            //System.out.println(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception();
        }


        return cityArrayList;
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
