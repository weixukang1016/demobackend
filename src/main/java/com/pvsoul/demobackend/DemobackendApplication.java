package com.pvsoul.demobackend;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({ "com.pvsoul.demobackend"})
public class DemobackendApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DemobackendApplication.class, args);
    }


    @Bean
    public ResourceConfig resourceConfig() {
        return new ResourceConfig();
    }

}
