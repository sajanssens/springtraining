package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class ClientSetter {

    private IPrinter printer;
    private IPrinter printer2;

    public ClientSetter() {
        System.out.println("Creating bean ClientSetter");
    }

    public void doeWat() {
        this.printer.print("Hello from client!");
        this.printer2.print("Hello2 from client!");
    }

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }

    public void setPrinter2(IPrinter printer2) {
        this.printer2 = printer2;
    }

    private void myinit() {
        System.out.println("myinit");
    }
}
