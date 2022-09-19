package org.service;

import org.dao.AccountDao;
import org.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class AccountServiceimpl implements AccountSService{
@Autowired
    private AccountDao AccountDao1;
    @Override
    public Account fiandbyid(Integer id) {
        return AccountDao1.findById(id);
    }

    @Override
    public void tranfer(String in, String out, Double money) {
        AccountDao1.inmoney(in,money);
        int i = 1/0;
        AccountDao1.outmoney(out,money);
    }

}
