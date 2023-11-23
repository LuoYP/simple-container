package org.example.element;

import org.example.element.enums.Scope;

/**
 * 元素定义，在类加载时扫描{@link Element},生成元素摘要信息
 */
public class ElementDefinition {

    private final Class<?> type;

    private final String name;

    private final Scope scope;

    public ElementDefinition(Class<?> type, String name, Scope scope) {
        this.type = type;
        this.name = name;
        this.scope = scope;
    }

    public Class<?> type() {
        return type;
    }

    public String name() {
        return name;
    }

    public Scope scope() {
        return scope;
    }
}
