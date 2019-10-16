package com.example.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ConsolePrinterTest {

    @Mock Logger log;
    @Mock ContactService contactService;
    @InjectMocks @Autowired ConsolePrinter consolePrinter;

    @Test
    public void print() {
        // given (setup mock behaviour)
        doNothing().when(log).info(anyString());
        when(contactService.get()).thenReturn(new Contact("MOCK!!!"));

        // when
        consolePrinter.print("Hoi");

        // then
        verify(log, times(1)).info("Hoi" + "MOCK!!!");
    }
}