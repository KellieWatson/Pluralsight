package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TICKETS")
public class Ticket {
    @Id
    @GeneratedValue
    @Getter
    private int id;

    @Column(name = "NUMBER")
    @Getter
    @Setter
    private String number;

    @Getter
    @Setter
    private String origin;

    @Getter
    @Setter
    private String destination;

}
