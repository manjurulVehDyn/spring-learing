package com.example.exerciseapp;

public class Football implements PageMessage {
  @Override
  public String getMessage(String name){
    return String.format("Now we have to play football.");
  }
}
