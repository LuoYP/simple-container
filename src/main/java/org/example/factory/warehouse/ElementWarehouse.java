package org.example.factory.warehouse;

import cn.hutool.core.lang.Pair;
import cn.hutool.core.text.CharSequenceUtil;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ElementWarehouse implements Warehouse<Class<?>, Object> {
    private final Map<Pair<Class<?>, String>, Object> elementWarehouse = new ConcurrentHashMap<>();

    private final Map<String, List<Class<?>>> elementNameIndex = new ConcurrentHashMap<>();

    @Override
    public void put(Class<?> key, Object value) {
        put(key, CharSequenceUtil.lowerFirst(key.getSimpleName()), value);
    }

    public void put(Class<?> key1, String key2, Object value) {
        Pair<Class<?>, String> key = Pair.of(key1, key2);
        elementWarehouse.compute(key, (k, v) -> value);
    }

    @Override
    public Object get(Class<?> key) {

        return null;
    }

    @Override
    public boolean check(Class<?> key) {
        return false;
    }
}
