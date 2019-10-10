package com.example;

import com.example.beans.IPrinter;
import org.slf4j.Logger;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    @Autowired private ApplicationContext ctx;

    public static void main(String[] args) { SpringApplication.run(SpringBootApp.class, args); }

    @Override public void run(String... args) throws Exception {
        IPrinter bean = (IPrinter) ctx.getBean("consolePrinter");
        bean.print("Hoi!");

        IPrinter filePrinter = (IPrinter) ctx.getBean("filePrinter");
        filePrinter.print("Hallo!");
    }

    @Bean @Scope("prototype")
    public Logger log(InjectionPoint ip) { return getLogger(ip.getMember().getDeclaringClass().getName()); }
}
