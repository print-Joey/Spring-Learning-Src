package com.joey.service.Imp;

import com.joey.dao.BookDAO;

import com.joey.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
//@Service 描述业务层的注解  和@Component的功能一样
// 主要作用: 方便区分   表现层 业务层和Dao
public class BookServiceImpl implements BookService {
    //@Autowired
    //依赖注入之自动装配(注入引用类型)
    // - 省去编写setter和Constructor
    @Autowired
    //@Qualifier
    //当此变量为接口 interface时,
    //此接口拥有多个实现类 Implementation
    //@Qualifier帮助Autowired选择实现类
    @Qualifier("BookDao")
    private BookDAO bookDAO;

    private BookServiceImpl() {
    }
    public void save(){
        System.out.println("Book service save");
        bookDAO.save();
    }



}
