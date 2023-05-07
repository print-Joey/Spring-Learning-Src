package com.joey.dao.Imp;

import com.joey.dao.BookDAO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//<bean id="bookDao" class="com.joey.dao.Imp.BookDAOImpl" />
//@Component代替了xml文件中的bean属性
//@Component("BookDao")

//@Repository 描述DAO的注解  和component的功能一样
// 主要作用: 方便区分   表现层 业务层和Dao
@Repository("BookDao")

//@Scope
//默认单例 singleton
//可设置成双例 prototype
@Scope("singleton")
public class BookDAOImpl implements BookDAO {
    //@Value("Joey")
    //注入基本类型
    @Value("Joey")
    private String name;

    //从配置文件jdbc.properties中拿取值
    //和@PropertySource("classpath:jdbc.properties")有依赖 见SpringConfig.java
    //@PropertySource的作用:告诉Spring在哪找num的值
    @Value("${num}")
    private int num;

    @Override
    public void save() {
        System.out.println("book save");
        System.out.println("Variable:");
        System.out.println(name);
        System.out.println(num);
    }


}




