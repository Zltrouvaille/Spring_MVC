package org.service;

import org.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;

public interface AccountSService {
    public Account fiandbyid(Integer id);
    @Transactional
    public void tranfer(String in,String out,Double money);
}
