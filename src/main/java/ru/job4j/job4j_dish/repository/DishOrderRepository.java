package ru.job4j.job4j_dish.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.job4j.job4j_dish.model.DishOrder;

public interface DishOrderRepository extends CrudRepository<DishOrder, Long> {

    @Query("INSERT INTO dish_order VALUES (:orderId, :dishId)")
    void save(@Param("orderId") Long orderId, @Param("dishId") Integer dishId);

}
