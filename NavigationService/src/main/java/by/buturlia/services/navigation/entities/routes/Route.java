package by.buturlia.services.navigation.entities.routes;

import by.buturlia.services.navigation.entities.cities.City;
import by.buturlia.services.navigation.entities.vichecles.Vichecle;
import by.buturlia.services.navigation.entities.vichecles.VichecleType;

public class Route {
    private City startCity;
    private City destinationCity;
    private VichecleType vichecleType;
    private int price;
    private int peopleCount;
    private int cargoCount;
}
