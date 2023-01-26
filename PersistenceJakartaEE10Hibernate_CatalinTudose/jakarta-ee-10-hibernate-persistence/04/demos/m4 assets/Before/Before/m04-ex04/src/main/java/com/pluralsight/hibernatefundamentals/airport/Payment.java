package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PAYMENTS")
public class Payment {
    @Id
    @GeneratedValue
    @Getter
    private int id;

    @Getter
    @Setter
    private Ticket ticket;

    @Getter
    @Setter
    private int amount;

}
