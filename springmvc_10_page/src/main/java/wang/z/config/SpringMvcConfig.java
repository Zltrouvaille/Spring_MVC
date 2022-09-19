package wang.z.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"wang.z.controller","wang.z.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
