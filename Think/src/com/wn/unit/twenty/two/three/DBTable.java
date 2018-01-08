package com.wn.unit.twenty.two.three;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by nengwei on 2018/1/8.
 * 生成外部文件
 * 这个是告诉注解处理器生成一个数据库表
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}
