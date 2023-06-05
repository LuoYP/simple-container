package org.example.element;

import java.lang.annotation.*;

/**
 * 被纳戒收取的元素
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Element {

    /**
     * 元素名称，默认使用类名驼峰
     * @return element name
     */
    String name() default "";
}