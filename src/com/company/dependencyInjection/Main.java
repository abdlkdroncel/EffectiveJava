package com.company.dependencyInjection;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /**
         * Sadece Türkçe desteği gibi oldu işe yaramadı
         */
        YaziAnalizUtil.isValid();

        /**
         * Sadece Türkçe desteği gibi oldu işe yaramadı
         */
        YaziAnalizSingleton.INSTANCE.isValid();

        Supplier<Sozluk> turkce=()->new Sozluk("Türkçe");

        YaziAnalizDepInj a=new YaziAnalizDepInj(turkce);
        a.isValid();

        Supplier<String> fs=()->"Test";
        fs.get();

        Supplier<String > x=()->YaziAnalizDepInj.uzunBirFonkisyonAdı();
        System.out.println(x.get());

    }
}
