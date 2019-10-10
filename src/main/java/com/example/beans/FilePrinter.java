package com.example.beans;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@File
public class FilePrinter implements IPrinter {
    @Autowired private Logger log;

    @Override public void print(String m) {
        log.info("Printing to file...: " + m);
    }
}
