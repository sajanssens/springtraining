package com.example.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ConsolePrinterTest {

    @Mock Logger log;
    @InjectMocks @Autowired ConsolePrinter consolePrinter;

    @Test
    public void print() {
        // doNothing().when(log).info(anyString());
        consolePrinter.print("Hoi");
        verify(log, times(1)).info("Hoi");
    }
}