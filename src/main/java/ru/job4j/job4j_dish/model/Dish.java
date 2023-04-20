package ru.job4j.job4j_dish.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table("dish")
public class Dish {

    @Id
    private Integer id;
    private String name;
    private String description;
}
