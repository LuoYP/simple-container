package org.example.factory.warehouse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SemiFinishedWarehouse implements Warehouse<Class<?>, Object> {

    private final Map<Class<?>, Object> semiFinishedMap = new ConcurrentHashMap<>();

    @Override
    public void put(Class<?> key, Object value) {
        semiFinishedMap.compute(key, (k, v) -> value);
    }

    @Override
    public Object get(Class<?> key) {
        return semiFinishedMap.get(key);
    }

    @Override
    public boolean check(Class<?> key) {
        return semiFinishedMap.containsKey(key);
    }
}
