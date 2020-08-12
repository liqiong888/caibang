package com.caibang.www.config.customAop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 登录自定义切面
 */

/**
 * Target设定注解使用范围
 * 取值	            注解使用范围
 * METHOD	        可用于方法上
 * TYPE	            可用于类或者接口上
 * ANNOTATION_TYPE	可用于注解类型上（被@interface修饰的类型）
 * CONSTRUCTOR	    可用于构造方法上
 * FIELD	        可用于域上
 * LOCAL_VARIABLE	可用于局部变量上
 * PACKAGE	        用于记录java文件的package信息
 * PARAMETER	    可用于参数上
 */
@Target(value = ElementType.METHOD)
/**
 *@Retention与RetentionPolicy这个枚举类型的常量一起指定注释要保留多长时间
 *
 * 取值    解释
 * SOURCE	编译器丢弃注释
 * CLASS	编译器会记录在文件中，默认运行时不需要虚拟机保留
 * RUNTIME	编译器记录在文件中，由虚拟机运行时保留，便于读取。
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginAop {

    String module();

}