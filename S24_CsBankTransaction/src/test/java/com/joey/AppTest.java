package com.joey;

import com.joey.config.SpringConfig;
import com.joey.service.AccountService;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
//两个注解 没记住
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AppTest
{
    @Autowired
    private AccountService accountService;

    @Test
    public void accountServiceTest(){
        accountService.transfer("Tom","Jerry",100);
    }
}
