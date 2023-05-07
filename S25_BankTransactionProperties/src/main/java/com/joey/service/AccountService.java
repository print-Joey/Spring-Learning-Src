package com.joey.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {

     //24.1-> @Transactional
     //写在接口类上(标准) 降低耦合
     @Transactional
     void transfer(String out, String in, double money);
}
