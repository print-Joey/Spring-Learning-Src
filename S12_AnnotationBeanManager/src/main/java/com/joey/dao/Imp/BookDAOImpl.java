package com.joey.dao.Imp;

import com.joey.dao.BookDAO;
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

    @Override
    public void save() {

    }

//以下两个为生命周期注解  lifeCycle
   @PostConstruct
    public void init() {
       System.out.println("init()");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}




