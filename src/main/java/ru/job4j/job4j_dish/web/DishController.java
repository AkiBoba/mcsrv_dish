package ru.job4j.job4j_dish.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.job4j.job4j_dish.model.Dish;
import ru.job4j.job4j_dish.repository.DishRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dish")
public class DishController {
    private final DishRepository repository;

    @GetMapping("/{id}")
    public Dish getDishById(@PathVariable Integer id) {
        return repository.findById(id).orElse(new Dish());
    }

    @GetMapping("/")
    public List<Dish> getAll() {
        return repository.findAll();
    }

    @PostMapping("/delete")
    public void deleteDish(@RequestBody Dish dish) {
        repository.delete(dish);
    }

    @PostMapping("/add")
    public void addDish(@RequestBody Dish dish) {
            repository.save(dish);
        }
}
