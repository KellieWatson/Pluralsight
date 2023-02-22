package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
public class Ticket {

    @Getter
    @Setter
    private String number;

    public Ticket(String number) {
        this.number = number;
    }

}