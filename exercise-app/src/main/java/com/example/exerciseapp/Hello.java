package com.example.exerciseapp;

public class Hello implements PageMessage {
  @Override
  public String getMessage(String name){
    return String.format("Assalamu A\'laikum wa Rahmatullahi wa Barakatuhu, %s!", name);
  }
}
