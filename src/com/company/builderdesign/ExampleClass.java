package com.company.builderdesign;

public class ExampleClass {

    //required
    private String field1;

    //optional
    private String field2;
    private String field3;

    /**
     * Builder Pattern Class
     */
    public static class Builder{

        //required
        private final String field1;

        //optional
        private String field2;
        private String field3;

        public Builder(String field1) {
            this.field1 = field1;
        }

        public Builder firstStatus(String a){
            field2=a;
            return this;
        }

        public Builder secondStatus(String a){
            field3=a;
            return this;
        }

        public ExampleClass build(){
            return new ExampleClass(this);
        }
    }

    public ExampleClass(Builder builder) {
        field1= builder.field1;
        field2=builder.field2;
        field3=builder.field3;
    }
}
