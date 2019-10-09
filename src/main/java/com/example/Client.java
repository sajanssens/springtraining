package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;


@Component
@Scope("prototype")
public class Client {
    @Autowired @Console
    private final IPrinter printer;

    @Autowired @File
    private final IPrinter printer2;

    @Autowired
    private List<IPrinter> allPrinters;

    public Client() {
        printer = null;
        printer2 = null;
    }

    public Client(IPrinter printer) {
        this.printer = printer;
        this.printer2 = printer;
    }

    public Client(IPrinter printer, IPrinter printer2) {
        this.printer = printer;
        this.printer2 = printer2;
    }

    public void doeWat() {
        this.printer.print("Hello from client!");
        this.printer2.print("Hello2 from client!");
    }

    public void printAlles() {
        allPrinters.forEach(p -> p.print("Hello allPrinters printer!"));
    }

    @PostConstruct
    public void init() {
        System.out.println("initializing client...");
    }
}
