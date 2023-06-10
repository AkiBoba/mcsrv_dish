package ru.job4j.job4j_dish.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j.job4j_dish.model.DTO.DishOrderDTO;
import ru.job4j.job4j_dish.repository.DishOrderRepository;

@Service
@Slf4j
@AllArgsConstructor
public class DishOrderService {

    private final DishOrderRepository repository;

    @KafkaListener(topics = "dish_order")
    public void receiveOrder(DishOrderDTO dto) {
        log.info(dto.toString());
    }
}
