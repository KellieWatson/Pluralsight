package com.pluralsight.persistencejakartaee.airport;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "ONE_WAY_TICKET")
public class OneWayTicket extends Ticket {

    @Getter
    @Setter
    private LocalDate latestDepartureDate;

}
