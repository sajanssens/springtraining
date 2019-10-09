package com.example;


import com.example.beans.Client;
import com.example.beans.ClientProvider;
import com.example.beans.IPrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnnotated {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.beans")) {
            IPrinter bean = (IPrinter) ctx.getBean("consolePrinter");
            bean.print("Hoi!");

            Client client = ctx.getBean(Client.class);
            client.doeWat();
            client.printAlles();

            Client client1 = ctx.getBean(ClientProvider.class).getClient();
            client1.doeWat();
        }

    }

}
