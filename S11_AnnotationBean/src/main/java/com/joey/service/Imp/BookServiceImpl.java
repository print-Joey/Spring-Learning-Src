package com.joey.service.Imp;

import com.joey.dao.BookDAO;

import com.joey.service.BookService;
import org.springframework.stereotype.Service;


@Service
//@Service 描述业务层的注解  和@Component的功能一样
// 主要作用: 方便区分   表现层 业务层和Dao
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    private BookServiceImpl() {
    }
    public void save(){
        System.out.println("Book service save");
        bookDAO.save();
    }
public void setBookDAO(BookDAO bookDAO) {
    this.bookDAO = bookDAO;
}


}
