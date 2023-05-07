package com.joey.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Configuration
@ComponentScan("com.joey")
//@PropertySource("jdbc.properties")
@PropertySource("classpath:jdbc.properties")
//@PropertySource("*.properties")  不允许*(不允许使用通配符) 会报错
//和@Value有依赖
//@Import()
//import其他配置
@Import(JDBCConfig.class)
/**
 * 纯注解开发
 */
public class SpringConfig {
}

