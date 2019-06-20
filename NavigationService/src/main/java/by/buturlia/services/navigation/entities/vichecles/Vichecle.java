package by.buturlia.services.navigation.entities.vichecles;

import by.buturlia.services.navigation.entities.cities.City;
import by.buturlia.services.navigation.entities.routes.Route;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Vichecle {
    private int id;
    private  String vichecleName;
    private  int speed;
    private int peopleCount;
    private int cargoCount;
    private VichecleType vichecleType;
    private int priceForKilometer;



    @Override
    public String toString() {
        return "Vichecle{" +
                "id=" + id +
                ", vichecleName='" + vichecleName + '\'' +
                ", speed=" + speed +
                ", peopleCount=" + peopleCount +
                ", cargoCount=" + cargoCount +
                ", vichecleType=" + vichecleType +
                ", priceForKilometer=" + priceForKilometer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vichecle)) return false;
        Vichecle vichecle = (Vichecle) o;
        return getId() == vichecle.getId() &&
                getSpeed() == vichecle.getSpeed() &&
                getPeopleCount() == vichecle.getPeopleCount() &&
                getCargoCount() == vichecle.getCargoCount() &&
                getPriceForKilometer() == vichecle.getPriceForKilometer() &&
                Objects.equals(getVichecleName(), vichecle.getVichecleName()) &&
                Objects.equals(getVichecleType(), vichecle.getVichecleType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVichecleName(), getSpeed(), getPeopleCount(), getCargoCount(), getVichecleType(), getPriceForKilometer());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVichecleName() {
        return vichecleName;
    }

    public void setVichecleName(String vichecleName) {
        this.vichecleName = vichecleName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public VichecleType getVichecleType() {
        return vichecleType;
    }

    public void setVichecleType(VichecleType vichecleType) {
        this.vichecleType = vichecleType;
    }

    public int getPriceForKilometer() {
        return priceForKilometer;
    }

    public void setPriceForKilometer(int priceForKilometer) {
        this.priceForKilometer = priceForKilometer;
    }

    public Vichecle(int id, String vichecleName, int speed, int peopleCount, int cargoCount, VichecleType vichecleType, int priceForKilometer) {
        this.id = id;
        this.vichecleName = vichecleName;
        this.speed = speed;
        this.peopleCount = peopleCount;
        this.cargoCount = cargoCount;
        this.vichecleType = vichecleType;
        this.priceForKilometer = priceForKilometer;
    }

    public Vichecle() {
    }

    public abstract ArrayList<Route> getRoutes(City firstCity, City secondCity);

}
