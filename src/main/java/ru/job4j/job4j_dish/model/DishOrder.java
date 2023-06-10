package ru.job4j.job4j_dish.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("dish_order")
public class DishOrder {
    @Id
    @Column("order_id")
    private Long orderId;
    @Column("dish_id")
    private Integer dishId;
}
