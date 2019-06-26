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
import java.util.Map;
import java.util.Scanner;

public class NavigationServiceRunner {

    public static void main(String[] args) throws Exception {

//        Connection connection = MySqlConnection.getConnection();
//        System.out.println("Check connection " + connection.isClosed());
        NavigationServiceRunner navigationServiceRunner = new NavigationServiceRunner();

        Map<String,City> cityMap = (new CityDAO()).get();


        System.out.println("Please choose starting city from list : ");

        City startingCity = navigationServiceRunner.getChosenCity(cityMap);
        cityMap.remove(startingCity);

        System.out.println("You choose " + startingCity);

        City destinationCity = navigationServiceRunner.getChosenCity(cityMap);

        System.out.println("You choose " + destinationCity);

        Map<String, Vichecle> vichecles = null;

        VichecleDAO vichecleDAO = new VichecleDAO();
        try {
            vichecles = vichecleDAO.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList routes = new ArrayList();
        for (Vichecle vichecle : vichecles.values()) {
            try {
                routes.add(vichecle.getRoutesToDestination(startingCity ,destinationCity));

            } catch (NoRouteExistException e) {
                continue;
            }
        }

        System.out.println(routes);



    }

    private City getChosenCity(Map<String, City> cityMap) throws NoRouteExistException {


        for (City city : cityMap.values()) {
            System.out.println(city);
        }
        System.out.println("Insert city id and press enter, 0 to exit program");
        int chosenNumber = new Scanner(System.in).nextInt();
        if (chosenNumber == 0) {
            throw new NoRouteExistException();
        }
        return cityMap.get(String.valueOf(chosenNumber));
    }


}

