package org.example.inject;

public @interface Autowired {

    boolean required() default true;

    String name() default "";
}
