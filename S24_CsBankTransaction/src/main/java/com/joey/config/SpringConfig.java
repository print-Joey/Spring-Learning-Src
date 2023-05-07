package com.joey.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.joey")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
//开启事务管理
@EnableTransactionManagement
public class SpringConfig {
}
