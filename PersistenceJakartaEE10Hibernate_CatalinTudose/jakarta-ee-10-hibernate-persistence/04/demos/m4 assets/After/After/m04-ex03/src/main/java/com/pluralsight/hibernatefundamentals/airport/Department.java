package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "DEPARTMENTS")
public class Department {
    @Id
    @GeneratedValue
    @Getter
    private int id;

    @Getter
    @Setter
    private String name;

}
