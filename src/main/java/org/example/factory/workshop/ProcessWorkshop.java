package org.example.factory.workshop;

import org.example.element.ElementDefinition;

public interface ProcessWorkshop {

    ElementDefinition obtainRawMaterials(Class<?> target);

    default <T> T process(Class<T> elementClass){
        ElementDefinition definition = obtainRawMaterials(elementClass);

    };

}
