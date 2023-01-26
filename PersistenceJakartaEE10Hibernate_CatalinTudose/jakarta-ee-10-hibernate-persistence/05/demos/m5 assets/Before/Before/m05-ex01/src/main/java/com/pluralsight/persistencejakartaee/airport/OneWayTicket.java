package com.pluralsight.persistencejakartaee.airport;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class OneWayTicket extends Ticket {

    @Getter
    @Setter
    private LocalDate latestDepartureDate;

}
