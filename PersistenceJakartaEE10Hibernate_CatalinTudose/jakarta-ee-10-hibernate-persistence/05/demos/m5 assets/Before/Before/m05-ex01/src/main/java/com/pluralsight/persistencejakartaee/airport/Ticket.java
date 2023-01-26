package com.pluralsight.persistencejakartaee.airport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public abstract class Ticket {

    @Getter
    private int id;

    @Getter
    @Setter
    private String number;

    public Ticket(String number) {
        this.number = number;
    }
}
