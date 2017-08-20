package com.talentica.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class MyApplication  extends SpringBootServletInitializer{

//    public MyApplication() {
//        super();
//        setRegisterErrorPageFilter(false); // <- this one
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        //setRegisterErrorPageFilter(false);
        return application.sources(MyApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
