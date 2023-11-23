package org.example;

import cn.hutool.core.text.CharSequenceUtil;
import cn.hutool.core.util.ClassUtil;
import org.example.factory.ElementDefinitionContainer;
import org.example.element.Element;
import org.example.element.ElementDefinition;
import org.example.element.enums.Scope;

import java.util.Set;

/**
 * Hello world!
 */
public class SimpleContainer {

    public static void run(Class<?> root) {
        ElementDefinitionContainer container = new ElementDefinitionContainer();
        String rootPackage = ClassUtil.getPackage(root);
        Set<Class<?>> targetClasses = ClassUtil.scanPackage(rootPackage, (c) -> null != c.getAnnotation(Element.class));
        targetClasses.stream().parallel().forEach(c -> {
            Element defineInfo = c.getAnnotation(Element.class);
            String elementName = defineInfo.name();
            Scope elementScope = defineInfo.scope();
            if (CharSequenceUtil.isBlank(elementName)) {
                elementName = CharSequenceUtil.lowerFirst(c.getSimpleName());
            }
            ElementDefinition definition = new ElementDefinition(c, elementName, elementScope);
            container.putElementDefinition(c, definition);
        });


    }
}
