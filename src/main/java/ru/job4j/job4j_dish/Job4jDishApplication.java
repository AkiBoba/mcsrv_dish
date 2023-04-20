package ru.job4j.job4j_dish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.*;

@SpringBootApplication
public class Job4jDishApplication {

    public static void main(String[] args) {
        SpringApplication.run(Job4jDishApplication.class, args);
        out.println("Dish app run");
    }

}
