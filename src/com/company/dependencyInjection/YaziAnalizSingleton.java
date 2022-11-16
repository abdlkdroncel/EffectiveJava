package com.company.dependencyInjection;

public class YaziAnalizSingleton {

    private static final Sozluk turkce=new Sozluk("Türkçe");

    public static YaziAnalizSingleton INSTANCE=new YaziAnalizSingleton();

    private YaziAnalizSingleton(){}

    public static boolean isValid(){
        return true;
    }
}
