package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @ManyToMany
    private List<Passenger> passengers = new ArrayList<>();

    public List<Passenger> getPassengers() {
        return Collections.unmodifiableList(passengers);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public Ticket(String number) {
        this.number = number;
    }

}
