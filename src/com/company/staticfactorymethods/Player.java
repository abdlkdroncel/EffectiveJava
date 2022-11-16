package com.company.staticfactorymethods;

public class Player {

    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Player agePlayer(String name){
        return new Player(name,10);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
