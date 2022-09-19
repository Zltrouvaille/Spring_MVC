package org.example;

import org.config.SpringConfig;
import org.dao.AccountDao;
import org.domain.Account;
import org.service.AccountSService;
import org.service.SSService;
import org.service.yyy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountSService bean = ctx.getBean(AccountSService.class);
        Account byId = bean.fiandbyid(1);
        System.out.println(byId);
       SSService bean1 = ctx.getBean(SSService.class);
       bean1.sun(10);
    }
}
