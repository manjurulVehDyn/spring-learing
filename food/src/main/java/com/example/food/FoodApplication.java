package com.example.food;

import com.example.food.dish.interfaces.Dish;
import com.example.food.dish.model.FishCurry;
import com.example.food.plate.Plate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class FoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Dish beefCurry = context.getBean("beefCurry", Dish.class);
		System.out.println(beefCurry.getDish());

		Dish fishCurry = context.getBean("fishCurry", FishCurry.class);
		System.out.println(fishCurry.getDish());

		Plate plate = context.getBean("plate", Plate.class);
		System.out.println(plate.getPlate());

	}

}
