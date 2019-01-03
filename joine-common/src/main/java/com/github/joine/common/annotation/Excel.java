package com.github.joine.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义导出Excel数据注解
 * 
 * @author JenphyJohn
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Excel
{
    /**
     * 导出到Excel中的名字.
     */
    String name();

    /**
     * 日期格式, 如: yyyy-MM-dd
     */
    String dateFormat() default "";

    /**
     * 读取内容转表达式 (如: 0=男,1=女,2=未知)
     */
    String readConverterExp() default "";

    /**
     * 导出时在excel中每个列的高度 单位为字符
     */
    double height() default 14;

    /**
     * 导出时在excel中每个列的宽 单位为字符
     */
    double width() default 20;

    /**
     * 文字后缀,如% 90 变成90%
     */
    String suffix() default "";

    /**
     * 当值为空时,字段的默认值
     */
    String defaultValue() default "";

    /**
     * 提示信息
     */
    String prompt() default "";

    /**
     * 设置只能选择不能输入的列内容.
     */
    String[] combo() default {};

    /**
     * 是否导出数据,应对需求:有时我们需要导出一份模板,这是标题需要但内容需要用户手工填写.
     */
    boolean isExport() default true;
}