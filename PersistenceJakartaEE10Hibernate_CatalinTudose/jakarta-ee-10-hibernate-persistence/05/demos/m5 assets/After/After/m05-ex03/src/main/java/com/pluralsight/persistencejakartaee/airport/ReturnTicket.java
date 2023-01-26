package com.pluralsight.persistencejakartaee.airport;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("R")
public class ReturnTicket extends Ticket {

    @Getter
    @Setter
    private LocalDate latestReturnDate;
}
