package com.pluralsight.hibernatefundamentals.airport;

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
    @Column(name = "PASSENGER_ID")
    @Getter
    private int id;

    @Column(name = "PASSENGER_NAME")
    @Getter
    @Setter
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

}
