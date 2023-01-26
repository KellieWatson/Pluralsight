package com.pluralsight.persistencejakartaee.airport;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class OneWayTicket extends Ticket {

    @Getter
    @Setter
    private LocalDate latestDepartureDate;

}
