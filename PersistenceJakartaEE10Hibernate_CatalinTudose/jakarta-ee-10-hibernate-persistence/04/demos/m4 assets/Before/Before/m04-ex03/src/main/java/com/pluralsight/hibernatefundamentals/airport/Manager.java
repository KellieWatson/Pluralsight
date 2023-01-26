package com.pluralsight.hibernatefundamentals.airport;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MANAGERS")
@NoArgsConstructor
public class Manager {
	@Id
	@GeneratedValue
	@Getter
	private int id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private Department department;

	public Manager(String name) {
		this.name = name;
	}

}
