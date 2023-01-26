package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

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

    @ElementCollection
    @CollectionTable(name = "PASSENGER_TICKETS", joinColumns = {
            @JoinColumn(name = "PASSENGER_ID", referencedColumnName = "ID") })
    private List<Ticket> tickets = new ArrayList<>();

    private Map<String, String> attributes = new HashMap<>();

    public Passenger(String name) {
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(attributes);
    }

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }
}
