package com.example.food.dish.model;

import com.example.food.dish.interfaces.Dish;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FishCurry")
public class FishCurry implements Dish {
    @Override
    public String getDish() {
        return "Fish curry in Bangladeshi style.";
    }
}
