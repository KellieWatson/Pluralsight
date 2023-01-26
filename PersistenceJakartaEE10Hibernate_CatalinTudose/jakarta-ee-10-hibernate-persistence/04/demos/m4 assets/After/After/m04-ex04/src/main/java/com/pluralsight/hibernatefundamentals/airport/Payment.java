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
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "TICKET_ID", referencedColumnName = "ID"),
            @JoinColumn(name = "TICKET_NUMBER", referencedColumnName = "NUMBER")
    })
    private Ticket ticket;

    @Getter
    @Setter
    private int amount;

}
