package com.example;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class ClientProvider {

    @Lookup() public Client getClient() {
        return null;
    }

}
