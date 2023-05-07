package com.joey.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;



@Configuration
@ComponentScan("com.joey")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
/**
 * 纯注解开发
 */
public class SpringConfig {


}

