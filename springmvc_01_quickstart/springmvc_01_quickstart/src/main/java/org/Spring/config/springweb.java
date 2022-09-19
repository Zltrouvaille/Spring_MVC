package org.Spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//创建springmvc的配置文件
@Configuration
@ComponentScan("org.wang")
@EnableWebMvc
public class springweb {

}
