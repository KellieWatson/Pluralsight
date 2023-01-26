package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TICKETS")
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    @Getter
    private int id;

    @Column(name = "NUMBER")
    @Getter
    @Setter
    private String number;

    public Ticket(String number) {
        this.number = number;
    }

}
