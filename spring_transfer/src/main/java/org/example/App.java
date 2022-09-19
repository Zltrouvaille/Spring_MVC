package org.example;

import org.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.domain.Account;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//       //创建SqlSessionFactoryBUilder对象
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        //加载SqlMapConfig
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml.bak");
//        //创建SqlSessionFactory对象
//        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
//        //获取SqlSession
//        SqlSession sqlSession = build.openSession();
//        //执行SqlSession对象查询
//        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//
//        Account ac = mapper.findById(1);
//        System.out.println(ac);



    }
}
