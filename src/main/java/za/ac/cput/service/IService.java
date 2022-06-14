package za.ac.cput.service;

import java.util.List;
import java.util.Optional;

public interface IService <T, ID>{

    T save();
    List<T> findAll();
    Optional<T> findById(ID id);
    void delete(T t);
}
