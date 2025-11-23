package io.github.saifulislamniloy.springlab.auto_configuration;

import java.util.HashMap;
import java.util.Map;

public class MyCache {
    private Map<String, Object> store = new HashMap<>();

    public void put(String key, Object value) {
        store.put(key, value);
    }

    public Object get(String key) {
        return store.get(key);
    }

    public void introduce() {
        System.out.println("I am MyCache");
    }

}