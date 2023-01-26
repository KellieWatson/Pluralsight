package com.pluralsight.persistencejakartaee.airport;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Table(name = "TICKETS")
public abstract class Ticket {

    @Id
    @GeneratedValue
    @Getter
    private int id;

    @Getter
    @Setter
    private String number;

    public Ticket(String number) {
        this.number = number;
    }
}
