package com.joey.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JDBCConfig {
    @Value("${jdbc.driver}")
    String DriverClass;

    @Value("${jdbc.url}")
    String url;

    @Value("${jdbc.username}")
    String username;

    @Value("${jdbc.password}")
    String password;


    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(url);
        dataSource.setDriverClassName(DriverClass);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager tM = new DataSourceTransactionManager();
        tM.setDataSource(dataSource);
        return tM;
    }
}
