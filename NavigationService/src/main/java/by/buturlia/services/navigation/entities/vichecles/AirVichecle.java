package by.buturlia.services.navigation.entities.vichecles;

import by.buturlia.services.navigation.entities.cities.City;
import by.buturlia.services.navigation.entities.routes.Route;

public class AirVichecle extends Vichecle {

    public Route getRoutesToDestination (City otherCity, City firstCity) throws NoRouteExistException{
        double coefForVichecleType = 1;
        double avarageRadius = 6371210.0;

        if (!(firstCity.isHasAirport() && otherCity.isHasAirport())) {
            throw new NoRouteExistException();
        }

        double d = Math.acos(
                Math.sin(firstCity.getLatitude()) * Math.sin(otherCity.getLatitude()) +
                        Math.cos(firstCity.getLatitude()) * Math.cos(otherCity.getLatitude()) * Math.cos(firstCity.getLongitude() - otherCity.getLongitude())
        );

        double distance = d * avarageRadius;

        Route route = new Route();
        route.setCargoCount(getCargoCount());
        route.setPeopleCount(getPeopleCount());
        route.setVichecleType(getVichecleType());
        route.setStartCity(firstCity);
        route.setDestinationCity(otherCity);
        route.setPrice((int) (distance * getPriceForKilometer() * coefForVichecleType) + 1);


        return route;
    }
}
