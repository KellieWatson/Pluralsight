package com.pluralsight.hibernatefundamentals.airport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Ticket {

    @Getter
    @Setter
    private String number;

    public Ticket(String number) {
        this.number = number;
    }

}
