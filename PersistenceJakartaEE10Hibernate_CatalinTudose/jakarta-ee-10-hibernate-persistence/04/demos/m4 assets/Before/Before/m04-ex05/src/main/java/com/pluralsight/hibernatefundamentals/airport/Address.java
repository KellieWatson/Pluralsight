package com.pluralsight.hibernatefundamentals.airport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
	private String street;
	private String number;
	private String zipCode;
	private String city;
}
