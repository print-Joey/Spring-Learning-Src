package com.joey.service.Imp;

import com.joey.dao.ResourceDao;
import com.joey.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImp implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    public boolean openLink(String username, String password){
        return resourceDao.readResource(username,password);
    }
}
