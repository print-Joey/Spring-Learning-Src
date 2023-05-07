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

    @Override
    public void save() {

    }
}




