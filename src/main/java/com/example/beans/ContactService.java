package com.example.beans;

import org.springframework.stereotype.Service;

@Service
public class ContactService {

    public Contact get() { return new Contact("Bram uit de database"); }

}
