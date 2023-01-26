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
    @Getter
    private int id;

    @Getter
    @Setter
    private String name;

    private List<Ticket> tickets = new ArrayList<>();

    public Passenger(String name) {
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

}
