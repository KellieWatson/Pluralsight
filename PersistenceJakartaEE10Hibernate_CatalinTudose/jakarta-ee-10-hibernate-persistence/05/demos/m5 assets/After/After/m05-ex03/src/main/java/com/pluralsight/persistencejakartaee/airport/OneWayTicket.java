package com.pluralsight.persistencejakartaee.airport;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("O")
public class OneWayTicket extends Ticket {
    @Getter
    @Setter
    private LocalDate latestDepartureDate;
}
