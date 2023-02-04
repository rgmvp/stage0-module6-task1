package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    Animal (String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){


        if (hasFur){
        return "This animal is mostly "+color+". It has "+ numberOfPaws+" paws and a fur.";
        }
        return "This animal is mostly "+color+". It has "+numberOfPaws+" paws and no fur.";

    }



}
