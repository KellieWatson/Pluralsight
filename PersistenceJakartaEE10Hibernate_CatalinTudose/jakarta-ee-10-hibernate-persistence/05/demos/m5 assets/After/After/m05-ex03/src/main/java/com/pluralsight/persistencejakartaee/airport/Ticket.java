package com.pluralsight.persistencejakartaee.airport;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TICKETS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TICKET_TYPE")
public abstract class Ticket {
    @Id
    @GeneratedValue
    @Getter
    private int id;

    @Getter
    @Setter
    private String number;

}
