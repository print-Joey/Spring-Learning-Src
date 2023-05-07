package com.joey.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//【黑马程序员SSM框架教程_Spring+SpringMVC+Maven高级+SpringBoot+MyBatisPlus企业实用开发技术】 https://www.bilibili.com/video/BV1Fi4y1S7ix/?p=22&share_source=copy_web&vd_source=55f4dd637d87e2d8d6f878cb7f1dd0a0&t=216

@Configuration
//@Configuration
// 可代替 xml里 beans标签
//<beans xmlns="http://www.springframework.org/schema/beans"
//        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//
//        xmlns:context="http://www.springframework.org/schema/context"
//        xsi:schemaLocation="
//        http://www.springframework.org/schema/beans
//        http://www.springframework.org/schema/beans/spring-beans.xsd
//        http://www.springframework.org/schema/context
//        http://www.springframework.org/schema/context/spring-context.xsd
//        ">
//</beans>
@ComponentScan("com.joey")
// 可代替 xml里 context:component-scan标签
//<context:component-scan base-package="com.joey"/>

//@ComponentScan() 可定义多个
// eg.
// @ComponentScan({"com.joey.dao","com.joey.service"})
/**
 * 纯注解开发
 */
public class SpringConfig {
}

