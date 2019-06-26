package by.buturlia.services.navigation.entities;

import by.buturlia.services.navigation.entities.cities.City;

import java.util.Map;

public interface CrudDAO<T> {
    void create(T t);

    void update(T t);

    void delete(int id);

    Map<String, T> get() throws Exception;

}
