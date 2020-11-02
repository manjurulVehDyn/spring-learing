package com.example.food.dish.model;

import com.example.food.dish.interfaces.Dish;
import org.springframework.stereotype.Component;

@Component
public class BeefCurry implements Dish {
    @Override
    public String getDish() {
        return "Delicious beef curry here.";
    }
}
