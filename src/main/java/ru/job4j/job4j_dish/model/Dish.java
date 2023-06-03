package ru.job4j.job4j_dish.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("dish")
public class Dish {
    @Id
    private Integer id;
    private String name;
    private String description;
}
