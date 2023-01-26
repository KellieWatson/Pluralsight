package com.pluralsight.persistencejakartaee.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PASSENGERS")
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue
    @Getter
    private int id;

    @Getter
    @Setter
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

}
