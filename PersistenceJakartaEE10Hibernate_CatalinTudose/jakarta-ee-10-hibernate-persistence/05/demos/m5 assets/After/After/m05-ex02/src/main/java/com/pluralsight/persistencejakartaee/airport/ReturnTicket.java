package com.pluralsight.persistencejakartaee.airport;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "RETURN_TICKET")
@AssociationOverride(name = "passenger", joinColumns = @JoinColumn(name = "pass_id"))
public class ReturnTicket extends Ticket {
    @Getter
    @Setter
    private LocalDate latestReturnDate;
}
