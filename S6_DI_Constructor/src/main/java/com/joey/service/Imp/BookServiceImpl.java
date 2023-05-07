package com.joey.service.Imp;

import com.joey.dao.BookDAO;
import com.joey.dao.Imp.BookDAOImpl;
import com.joey.dao.Imp.UserDaoImpl;
import com.joey.dao.UserDao;
import com.joey.service.BookService;
import org.springframework.context.annotation.Bean;

public class BookServiceImpl implements BookService {
//删除业务层中用new的方式创建对象
    private BookDAO bookDAO;
    private UserDao userDao;



    //Spring-07 Bean的实例化  构造器可以用private修饰 但一定要空参 绝不可以带参
    private BookServiceImpl() {
    }
    public void save(){
        System.out.println("Book service save");
        bookDAO.save();
    }
//提供构造器

    public BookServiceImpl(BookDAO bookDAO,UserDao userDao) {
        this.bookDAO = bookDAO;
        this.userDao = userDao;
    }
}
