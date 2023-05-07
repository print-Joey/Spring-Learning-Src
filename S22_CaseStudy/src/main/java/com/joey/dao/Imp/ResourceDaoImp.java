package com.joey.dao.Imp;

import com.joey.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImp implements ResourceDao {
    public boolean readResource(String username, String password) {
        return password.equals("root");
    }
}
