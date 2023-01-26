package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PASSENGERS")
@NoArgsConstructor
public class Passenger {
	@Id
	@GeneratedValue
	@Getter
	private int id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "street", column = @Column(name = "PASSENGER_STREET")),
            @AttributeOverride(name = "number", column = @Column(name = "PASSENGER_NUMBER")),
			@AttributeOverride(name = "zipCode", column = @Column(name = "PASSENGER_ZIP_CODE")),
			@AttributeOverride(name = "city", column = @Column(name = "PASSENGER_CITY"))
	})
	private Address address;

	public Passenger(String name) {
		this.name = name;
	}

}
