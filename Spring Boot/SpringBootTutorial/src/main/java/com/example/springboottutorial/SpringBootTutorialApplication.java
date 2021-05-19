package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootTutorialApplication.class, args);

        Alien a = context.getBean(Alien.class);
        a.show();
//
//        Alien a1 = context.getBean(Alien.class);
//        a1.show();
    }

}
