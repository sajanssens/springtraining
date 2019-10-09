package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;


@Component
@Scope("prototype")
public class Client {
    @Autowired @Console
    private IPrinter printer;
    @Autowired @File
    private IPrinter printer2;

    @Autowired
    private List<IPrinter> allPrinters;
    @Autowired
    private Map<String, IPrinter> allPrintersMap;

    public void doeWat() {
        this.printer.print("Hello from client!");
        this.printer2.print("Hello2 from client!");
    }

    public void printAlles() {
        System.out.println("Printing all printers:");
        allPrinters.forEach(p -> p.print("Hello allPrinters printer!"));

        System.out.println("Printing all printers as map:");
        allPrintersMap.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    @PostConstruct
    public void init() {
        System.out.println("initializing client...");
    }
}
