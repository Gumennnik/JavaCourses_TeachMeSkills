package by.buturlia.services.navigation.entities;

public class City {
    private int cityId;
    private String cityName;
    private boolean isHasGroundRoad;
    private boolean isHasAirport;
    private boolean isHasSeaport;

    private double latitude;
    private double longitude;

    public City(int cityId, String cityName, boolean isHasGroundRoad, boolean isHasAirport, boolean isHasSeaport, double latitude, double longitude) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.isHasGroundRoad = isHasGroundRoad;
        this.isHasAirport = isHasAirport;
        this.isHasSeaport = isHasSeaport;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isHasGroundRoad() {
        return isHasGroundRoad;
    }

    public void setHasGroundRoad(boolean hasGroundRoad) {
        isHasGroundRoad = hasGroundRoad;
    }

    public boolean isHasAirport() {
        return isHasAirport;
    }

    public void setHasAirport(boolean hasAirport) {
        isHasAirport = hasAirport;
    }

    public boolean isHasSeaport() {
        return isHasSeaport;
    }

    public void setHasSeaport(boolean hasSeaport) {
        isHasSeaport = hasSeaport;
    }

    public City() {
    }
}
