package com.joey.service.impl;

import com.joey.dao.AccountDao;
import com.joey.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void transfer(String out, String in, double money) {
        accountDao.outMoney(out,money);
        //制作异常
        //int i = 1/0;
        accountDao.inMoney(in,money);
    }
}
