package com.company.dependencyInjection;

import java.util.function.Supplier;

public class YaziAnalizDepInj {

    private final Sozluk sozluk;

    public YaziAnalizDepInj(Supplier<Sozluk> sozluk) {
        this.sozluk = sozluk.get();
    }

    public static boolean isValid(){
        return true;
    }

    public static String uzunBirFonkisyonAdı(){
        return "Test";
    }
}
