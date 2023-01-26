package com.pluralsight.persistencejakartaee.airport;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Ticket {
    @Id
    @GeneratedValue
    @Getter
    private int id;

    @Getter
    @Setter
    private String number;

}
