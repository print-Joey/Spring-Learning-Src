package com.joey.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.joey.dao.BookDAO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.awt.print.Book;

//有Import(见SpringConfig)后不需要@Configuration
//@Configuration
public class JDBCConfig {
//使用第三方Bean
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;
    @Value("root")
    private String username;
    @Value("abc123")
    private String password;
    @Bean
    //简单类型用@Value,引用类型用形参
    public DataSource dataSource(BookDAO bookDAO) {
        System.out.println(bookDAO);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
