package com.example;

import com.example.beans.IPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    @Autowired private ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

    @Override public void run(String... args) throws Exception {
        IPrinter bean = (IPrinter) ctx.getBean("consolePrinter");
        bean.print("Hoi!");
    }
}
