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
	@OneToOne
	@JoinTable(name = "MANAGER_TO_DEPARTMENT", joinColumns = {
                 @JoinColumn(name = "MANAGER_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
			     @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "ID", nullable = false)
	})
	private Department department;

	public Manager(String name) {
		this.name = name;
	}

}
