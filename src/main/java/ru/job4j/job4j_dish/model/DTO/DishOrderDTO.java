package ru.job4j.job4j_dish.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishOrderDTO {
    private Long orderId;
    private List<Integer> dishesId;
}
