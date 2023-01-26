package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {
	private String street;
	private String number;
	private String zipCode;
	private String city;
}
