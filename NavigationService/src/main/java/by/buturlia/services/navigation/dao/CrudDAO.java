package by.buturlia.services.navigation.dao;

import java.util.List;

public interface CrudDAO<T> {
    void create(T t);
    void update(T t);
    void delete(int id);
    List<T> get();

}
