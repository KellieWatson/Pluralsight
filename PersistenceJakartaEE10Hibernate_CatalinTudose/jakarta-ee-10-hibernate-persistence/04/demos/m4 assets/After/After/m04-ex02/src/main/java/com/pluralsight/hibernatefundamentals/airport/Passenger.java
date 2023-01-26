package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @ManyToMany(mappedBy = "passengers")
    private List<Ticket> tickets = new ArrayList<>();

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public Passenger(String name) {
        this.name = name;
    }

}
