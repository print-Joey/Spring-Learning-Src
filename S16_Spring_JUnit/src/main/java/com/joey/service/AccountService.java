package com.joey.service;

import com.joey.dao.AccountDao;
import com.joey.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {



    public void save(Account account);

    public void update(Account account);

    public void delete(Integer id);

    public Account findById(Integer id);

    public List<Account> findAll();
}

