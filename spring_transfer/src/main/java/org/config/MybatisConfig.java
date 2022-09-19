package org.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class MybatisConfig {
     @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
         SqlSessionFactoryBean  ssfb = new SqlSessionFactoryBean();
         ssfb.setTypeAliasesPackage("org.domain");
         ssfb.setDataSource(dataSource);
        return ssfb;
    }
}
