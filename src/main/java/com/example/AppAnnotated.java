package com.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnnotated {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.example")) {
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
