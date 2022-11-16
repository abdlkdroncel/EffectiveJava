package com.company.staticfactorymethods;

import com.company.staticfactorymethods.Food;

public class Main {

    public static void main(String[] args) {
        Food food=Food.coldFood("x");
        Food food1=Food.hotFood("y");
        /**
         * Constructorlara static metodlarla erişim
         */
        System.out.println(food.hashCode());
        System.out.println(food1.hashCode());

        Player p=Player.agePlayer("Ronaldo");
        System.out.println(p.getAge()+" "+p.getName());
    }

    /**
     * static constructor
     * 1- cons. isim farklı verebiliyoruz
     * 2- cons alt tipte obje üretebiliyoruz
     * 3- cons sabit deger verebiliriz
     */
}
