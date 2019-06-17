package by.buturlia.services.navigation.dao;

import by.buturlia.services.navigation.entities.City;

public interface CityDAO extends CrudDAO<City> {
    by.buturlia.services.navigation.entities.City getCitiesByName();


}
