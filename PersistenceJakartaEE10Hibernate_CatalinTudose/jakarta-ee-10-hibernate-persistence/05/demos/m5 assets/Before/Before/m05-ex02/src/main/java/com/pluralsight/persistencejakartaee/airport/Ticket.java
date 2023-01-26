package com.pluralsight.persistencejakartaee.airport;


import lombok.Getter;
import lombok.Setter;

public abstract class Ticket {
    @Getter
    private int id;

    @Getter
    @Setter
    private String number;

    @Getter
    @Setter
    private Passenger passenger;

}
