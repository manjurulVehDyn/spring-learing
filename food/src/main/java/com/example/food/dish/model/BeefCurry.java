package com.example.food.dish.model;

import com.example.food.dish.interfaces.Dish;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BeefCurry")
public class BeefCurry implements Dish {
    @Override
    public String getDish() {
        return "Delicious beef curry here.";
    }
}
