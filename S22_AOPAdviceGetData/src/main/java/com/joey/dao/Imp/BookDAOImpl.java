package com.joey.dao.Imp;

import com.joey.dao.BookDAO;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("BookDao")
public class BookDAOImpl implements BookDAO {

    @Override
    public String findName(int id) {
        System.out.println("findName(int id)  id =>"+id);
        return "Joey";
    }
}




