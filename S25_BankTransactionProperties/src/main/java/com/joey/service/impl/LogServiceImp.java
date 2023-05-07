package com.joey.service.impl;

import com.joey.dao.LogDao;
import com.joey.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImp  implements LogService {

    @Autowired
    private LogDao logDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void log(String out, String in, Double money) {

        //info  varchar(255)     not null,
        logDao.log("Transfer from account " + out + "to account " + in + "Amount " + money);
    }
}
