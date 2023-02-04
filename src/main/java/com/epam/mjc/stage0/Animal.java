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

    String getDescription(){
        if (hasFur && numberOfPaws > 1){
        return "This animal is mostly "+color+". It has "+numberOfPaws+" paws and "+"a"+" fur.";
        }
        else if (hasFur && numberOfPaws < 2)
            return "This animal is mostly "+color+". It has "+numberOfPaws+" paw and "+"a"+" fur.";
        else if (!hasFur && numberOfPaws > 1)
            return "This animal is mostly "+color+". It has "+numberOfPaws+" paws and "+"no"+" fur.";
        else
            return "This animal is mostly "+color+". It has "+numberOfPaws+" paw and "+"no"+" fur.";

    }

    public static void main(String[] args) {
        Bird brd = new Bird();
        Dog dg = new Dog();
        dg.getDescription();
        brd.getDescription();
    }

}
