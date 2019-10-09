package com.example.beans;

import org.springframework.stereotype.Component;

@Component
@File
public class FilePrinter implements IPrinter {
    @Override public void print(String m) {
        System.out.println("Printing to file...: " + m);
    }
}
