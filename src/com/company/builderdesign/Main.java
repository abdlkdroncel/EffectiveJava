package com.company.builderdesign;

public class Main {
    public static void main(String[] args) {


        ExampleClass exampleClass=new ExampleClass.Builder("x").firstStatus("y").secondStatus("z").build();
        ExampleClass exampleClass1=new ExampleClass.Builder("x").build();
    }
}
