package com.wn.unit.twenty.one.one;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by nengwei on 2018/1/7.
 *
 * @Target：定义注解用于什么地方
 * @Retention：用来定义该注解在那个级别可用
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}
