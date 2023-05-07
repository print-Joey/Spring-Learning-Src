package com.joey.dao.Imp;

import com.joey.dao.BookDAO;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookDAOImpl implements BookDAO {


    public void save() {
        System.out.println("BookDao save..." );
    }


}
