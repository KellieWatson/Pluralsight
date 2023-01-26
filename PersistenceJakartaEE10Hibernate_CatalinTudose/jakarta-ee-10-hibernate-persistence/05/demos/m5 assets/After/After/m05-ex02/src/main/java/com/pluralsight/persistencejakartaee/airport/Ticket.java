package com.pluralsight.persistencejakartaee.airport;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class Ticket {
    @Getter
    @Id
    @GeneratedValue
    private int id;

    @Getter
    @Setter
    private String number;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

}
