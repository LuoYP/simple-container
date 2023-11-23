package org.example.factory;

import org.example.element.ElementDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 保存ElementDefinition的容器
 */
public class ElementDefinitionContainer {

    private final Map<Class<?>, ElementDefinition> elementDefinitionMap = new ConcurrentHashMap<>();

    public void putElementDefinition(Class<?> key, ElementDefinition value) {
        elementDefinitionMap.compute(key, (k, v) -> value);
    }

    public ElementDefinition removeElementDefinition(Class<?> key) {
        return elementDefinitionMap.remove(key);
    }

    public ElementDefinition getElementDefinition(Class<?> key) {
        return elementDefinitionMap.get(key);
    }
}
