package ru.job4j.job4j_dish.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.job4j_dish.model.Dish;

import java.util.List;

public interface DishRepository extends CrudRepository<Dish, Integer> {
    List<Dish> findAll();
}
