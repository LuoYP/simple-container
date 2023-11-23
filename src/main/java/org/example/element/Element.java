package org.example.element;

import org.example.element.enums.Scope;

import java.lang.annotation.*;

/**
 * 需要装载进容器中的元素
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Element {

    /**
     * 元素名称，默认使用类名驼峰
     *
     * @return element name
     */
    String name() default "";

    /**
     * 实例化方式,默认单例实现
     *
     * @return
     */
    Scope scope() default Scope.singleton;
}