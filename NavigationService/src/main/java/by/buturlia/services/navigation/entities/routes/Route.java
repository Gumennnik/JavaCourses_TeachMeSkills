package by.buturlia.services.navigation.entities.routes;

import by.buturlia.services.navigation.entities.cities.City;
import by.buturlia.services.navigation.entities.vichecles.Vichecle;
import by.buturlia.services.navigation.entities.vichecles.VichecleType;

import java.util.Objects;

public class Route {
    private City startCity;
    private City destinationCity;
    private VichecleType vichecleType;
    private int price;
    private int peopleCount;
    private int cargoCount;



    @Override
    public String toString() {
        return "Route{" +
                "startCity=" + startCity +
                ", destinationCity=" + destinationCity +
                ", vichecleType=" + vichecleType +
                ", price=" + price +
                ", peopleCount=" + peopleCount +
                ", cargoCount=" + cargoCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route)) return false;
        Route route = (Route) o;
        return getPrice() == route.getPrice() &&
                getPeopleCount() == route.getPeopleCount() &&
                getCargoCount() == route.getCargoCount() &&
                Objects.equals(getStartCity(), route.getStartCity()) &&
                Objects.equals(getDestinationCity(), route.getDestinationCity()) &&
                Objects.equals(getVichecleType(), route.getVichecleType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartCity(), getDestinationCity(), getVichecleType(), getPrice(), getPeopleCount(), getCargoCount());
    }

    public City getStartCity() {
        return startCity;
    }

    public void setStartCity(City startCity) {
        this.startCity = startCity;
    }

    public City getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(City destinationCity) {
        this.destinationCity = destinationCity;
    }

    public VichecleType getVichecleType() {
        return vichecleType;
    }

    public void setVichecleType(VichecleType vichecleType) {
        this.vichecleType = vichecleType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getCargoCount() {
        return cargoCount;
    }

    public void setCargoCount(int cargoCount) {
        this.cargoCount = cargoCount;
    }

    public Route() {
    }

    public Route(City startCity, City destinationCity, VichecleType vichecleType, int price, int peopleCount, int cargoCount) {
        this.startCity = startCity;
        this.destinationCity = destinationCity;
        this.vichecleType = vichecleType;
        this.price = price;
        this.peopleCount = peopleCount;
        this.cargoCount = cargoCount;
    }
}
