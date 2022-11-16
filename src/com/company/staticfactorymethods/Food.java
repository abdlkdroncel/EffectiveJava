package com.company.staticfactorymethods;

public class Food {

    public static Food coldFood(String name){
        return new Food();
    }

    public static Food hotFood(String name){
        return new Food();
    }

    public static Food subFood(String name){
        return new SubFood();
    }

}
