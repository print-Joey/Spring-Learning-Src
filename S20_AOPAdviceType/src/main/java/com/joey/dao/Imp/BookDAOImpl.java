package com.joey.dao.Imp;

import com.joey.dao.BookDAO;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

//<bean id="bookDao" class="com.joey.dao.Imp.BookDAOImpl" />
//@Component代替了xml文件中的bean属性
//@Component("BookDao")

//@Repository 描述DAO的注解  和component的功能一样
// 主要作用: 方便区分   表现层 业务层和Dao
@Repository("BookDao")
public class BookDAOImpl implements BookDAO {

    //18.2 创建切入点update() save()  //下步见MyAdvice
    @Override
    public int select() {
        System.out.println("bookdao select");
        //制造异常 使MyAdvice.AfterThrowing()可以运行
        //int i = 1/0;
        return 100;
    }

    @Override
    public void update() {
        System.out.println("bookdao update");

    }
}




