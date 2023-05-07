package com.joey.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Configuration
@ComponentScan("com.joey")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
/**
 * 纯注解开发
 */
public class SpringConfig {
}

