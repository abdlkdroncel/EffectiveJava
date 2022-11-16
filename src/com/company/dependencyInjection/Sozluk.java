package com.company.dependencyInjection;

public class Sozluk {
    private String dil;

    public Sozluk(String dil) {
        this.dil = dil;
    }

    @Override
    public String toString() {
        return "Sozluk{" +
                "dil='" + dil + '\'' +
                '}';
    }
}
