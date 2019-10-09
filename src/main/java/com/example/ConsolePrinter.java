package com.example;

import org.springframework.stereotype.Component;

@Component
@Console
public class ConsolePrinter implements IPrinter {
    @Override public void print(String m) {
        System.out.println(m);
    }
}