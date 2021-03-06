package com.example.beans;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Console
public class ConsolePrinter implements IPrinter {
    @Autowired private Logger log;
    @Autowired private ContactService contactService;

    @Override public void print(String m) { log.info(m + contactService.get().getNaam()); }
}