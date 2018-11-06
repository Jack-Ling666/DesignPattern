package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//记得加上注解的作用域，作用对象

//定义注释时候，需要通过元注解Retention说明当前自定义注解的作用域（Class，Source，Runtime）
@Retention(RetentionPolicy.RUNTIME)
//定义注释时候，需要通过元注解Target说明当前自定义注解的作用对象（method）
@Target(ElementType.METHOD)
public @interface MyTest {
    public long timeout() default 100;
}
