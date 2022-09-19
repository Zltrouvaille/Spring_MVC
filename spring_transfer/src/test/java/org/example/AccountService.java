package org.example;


import org.config.SpringConfig;
import org.dao.AccountDao;
import org.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.service.AccountSService;
import org.service.AccountServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountService {
    @Autowired
    private AccountSService accountDao;

    @Test
    public void testFindByid(){
      accountDao.tranfer("lisi","wangwu",10D);
    }

}
