package com.joey.service;

import com.joey.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//15.3 => 设定类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//15.4 => Spring环境设置
//@ContextConfiguration(SpringConfig.class)
// 报错原因:不是用的value属性(默认为value), 而是用classes属性
@ContextConfiguration(classes=SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        System.out.println(accountService.findById(2));
    }
    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }

}
