package com.company.singletondesignpattern;

public class DefineSingleTon {

    public static DefineSingleTon ds=new DefineSingleTon();
    private DefineSingleTon() {

    }

    public static DefineSingleTon getInstance(){
        return ds;
    }
}
