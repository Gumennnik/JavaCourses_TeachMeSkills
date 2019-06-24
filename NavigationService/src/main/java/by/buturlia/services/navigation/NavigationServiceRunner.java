package by.buturlia.services.navigation;


import by.buturlia.services.navigation.db.MySqlConnection;
import by.buturlia.services.navigation.entities.cities.City;
import by.buturlia.services.navigation.entities.cities.dao.CityDAO;
import by.buturlia.services.navigation.entities.vichecles.NoRouteExistException;
import by.buturlia.services.navigation.entities.vichecles.Vichecle;
import by.buturlia.services.navigation.entities.vichecles.dao.VichecleDAO;

import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NavigationServiceRunner {

    public static void main(String[] args) throws Exception {

//        Connection connection = MySqlConnection.getConnection();
//        System.out.println("Check connection " + connection.isClosed());

        List<City> cityList = (new CityDAO()).get();


        System.out.println("Please choose starting city from list : ");

        for (City city : cityList) {
            System.out.println(city);
        }
        System.out.println("Insert city id and press enter, 0 to exit program");
        int chosenNumber = new Scanner(System.in).nextInt();
        if (chosenNumber == 0) {
            return;
        }

        City startingCity = cityList.get(chosenNumber - 1);
        cityList.remove(startingCity);

        System.out.println("You choose " + startingCity);

        for (City city : cityList) {
            System.out.println(city);
        }
        System.out.println("Insert city id and press enter, 0 to exit program");
        chosenNumber = new Scanner(System.in).nextInt();
        if (chosenNumber == 0) {
            return;
        }

        City destinationCity = cityList.get(chosenNumber -1 );


        List<Vichecle> vichecles = null;

        VichecleDAO vichecleDAO = new VichecleDAO();
        try {
            vichecles = vichecleDAO.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Vichecle vichecle : vichecles) {
            try {
                vichecle.getRoutesToDestination(city ,city)

            } catch (NoRouteExistException e) {
                continue;
            }
        }



    }


}

