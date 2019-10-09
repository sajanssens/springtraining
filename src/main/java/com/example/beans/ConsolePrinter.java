package com.example.beans;

import org.springframework.stereotype.Component;

@Component
@Console
public class ConsolePrinter implements IPrinter {
    @Override public void print(String m) {
        System.out.println(m);
    }
}