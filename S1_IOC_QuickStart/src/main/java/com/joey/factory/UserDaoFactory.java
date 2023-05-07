package com.joey.factory;

import com.joey.dao.Imp.UserDaoImpl;
import com.joey.dao.UserDao;

public class UserDaoFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
