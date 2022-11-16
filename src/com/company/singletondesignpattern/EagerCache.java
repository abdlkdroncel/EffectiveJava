package com.company.singletondesignpattern;

import java.util.HashMap;

public class EagerCache implements Cache{
    /**
     * Bellekte yeri ayrılmış olur
     */
    private static final EagerCache instance=new EagerCache();

    private HashMap<Object,Object> map;

    public EagerCache() {
        map=new HashMap<>();
    }

    @Override
    public void put(Object key, Object value) {
        map=new HashMap<>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    public static EagerCache getInstance(){
        return instance;
    }
}
