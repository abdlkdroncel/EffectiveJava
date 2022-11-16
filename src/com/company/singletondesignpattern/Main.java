package com.company.singletondesignpattern;

public class Main {
    public static void main(String[] args) {
        /**
         * Singleton bir sınıfın sadece bir instance olmasıdır
         */
        DefineSingleTon ds=DefineSingleTon.ds;
        DefineSingleTon ds1=DefineSingleTon.getInstance();

        System.out.println(ds.hashCode());
        System.out.println(ds1.hashCode());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lazy Hash: "+LazyCache.getInstance().hashCode());
                System.out.println("Lazy Eager: "+EagerCache.getInstance().hashCode());
                System.out.println("Enum Hash: "+CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Lazy Hash: "+LazyCache.getInstance().hashCode());
                System.out.println("Lazy Eager: "+EagerCache.getInstance().hashCode());
                System.out.println("Enum Hash: "+CacheSingleton.INSTANCE.hashCode());
            }
        }).start();
    }


}
