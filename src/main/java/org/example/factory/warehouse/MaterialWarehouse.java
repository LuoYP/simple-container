package org.example.factory.warehouse;

import org.example.element.ElementDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MaterialWarehouse implements Warehouse<Class<?>, ElementDefinition> {

    private final Map<Class<?>, ElementDefinition> elementDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public void put(Class<?> key, ElementDefinition value) {
        elementDefinitionMap.compute(key, (k, v) -> value);
    }

    @Override
    public ElementDefinition get(Class<?> key) {
        return elementDefinitionMap.get(key);
    }

    @Override
    public boolean check(Class<?> key) {
        return elementDefinitionMap.containsKey(key);
    }
}
