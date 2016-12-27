package ua.com.smiddle.remember.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan("ua.com.smiddle")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Autowired
    Environment environment;

    //======================================= Beans ==============================================

//    @Bean(name = "multipartResolver")
//    @Description("Обертка для Apache multipart request")
//    public CommonsMultipartResolver multipartResolver() {
//        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//        resolver.setMaxUploadSizePerFile(10000000);
//        resolver.setDefaultEncoding("utf8");
//        return resolver;
//    }

}
