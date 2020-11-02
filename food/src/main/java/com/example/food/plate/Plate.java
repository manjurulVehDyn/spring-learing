package com.example.food.plate;

import com.example.food.dish.interfaces.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Plate {

    @Autowired
    @Qualifier("BeefCurry")
    Dish dish;

    public String getPlate() {
        return "This plate includes : " + dish.getDish();
    }
}
