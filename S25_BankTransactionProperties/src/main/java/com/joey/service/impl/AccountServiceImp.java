package com.joey.service.impl;

import com.joey.dao.AccountDao;
import com.joey.dao.LogDao;
import com.joey.service.AccountService;
import com.joey.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    public void transfer(String out, String in, double money) {
        try {
            accountDao.outMoney(out,money);
            //制作异常
            //int i = 1/0;
            accountDao.inMoney(in,money);
        } finally {
            logService.log(out, in,money);
        }
    }
}
//try finally vs try catch finally
//try finally
//1.try > finally (not matter try block throws a exception)

//try catch finally
//1.try >catch(if try block throws a exception)(otherwise skip the catch block code) > finally (not matter try block throws a exception)