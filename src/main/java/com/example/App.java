package com.example;


import com.example.beans.Client;
import com.example.beans.ClientSetter;
import com.example.beans.IPrinter;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try (AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("myconfig.xml")) {
            IPrinter bean = (IPrinter) ctx.getBean("printer");
            bean.print("Hoi!");

            Client client = ctx.getBean(Client.class);
            client.doeWat();

            ClientSetter bean1 = ctx.getBean(ClientSetter.class);
            bean1.doeWat();

            Client client1 = new App().getClient();
            client1.doeWat();

        }

    }

    @Lookup
    public Client getClient() {
        return null;
    }
}
