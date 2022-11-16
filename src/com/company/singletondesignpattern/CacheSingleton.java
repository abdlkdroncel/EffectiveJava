package com.company.singletondesignpattern;


import java.util.HashMap;

public enum CacheSingleton implements Cache {
    INSTANCE;

    private HashMap<Object,Object> map=new HashMap<>();

    @Override
    public void put(Object key, Object value) {
        map=new HashMap<>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }
}
