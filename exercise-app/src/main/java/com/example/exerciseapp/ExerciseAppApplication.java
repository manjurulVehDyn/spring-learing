package com.example.exerciseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExerciseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseAppApplication.class, args);
	}

  @GetMapping("/")
  public String homepage(){
    return String.format("This is the homepage.");
  }


  @GetMapping("/home")
  public String homepage1(){
    return String.format("This is the homepage.");
  }

  @GetMapping("/hello")
  public String hello(@RequestParam(value="name", defaultValue="World") String name){
    PageMessage helloMessage = new Hello();
    return helloMessage.getMessage(name);
  }

  @GetMapping("/football")
  public String football(){
    PageMessage footballMessage = new Football();
    return footballMessage.getMessage("");
  }

}
