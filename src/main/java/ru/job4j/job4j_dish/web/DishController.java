package ru.job4j.job4j_dish.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.job4j.job4j_dish.model.Dish;
import ru.job4j.job4j_dish.service.DishSevice;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dish")
public class DishController {

    private final DishSevice service;

    @GetMapping("/{id}")
    public Dish getDishById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/")
    public List<Dish> getAll() {
        return service.getAll();
    }

    @PostMapping("/delete")
    public void deleteDish(@RequestBody Dish dish) {
        service.delete(dish);
    }

    @PostMapping("/add")
    public void addDish(@RequestBody Dish dish) {
        service.create(dish);
    }
}
