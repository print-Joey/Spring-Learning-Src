package com.joey.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;



@Configuration
@ComponentScan("com.joey")
//18.9 =>开启切面自动代理
@EnableAspectJAutoProxy
public class SpringConfig {
}

