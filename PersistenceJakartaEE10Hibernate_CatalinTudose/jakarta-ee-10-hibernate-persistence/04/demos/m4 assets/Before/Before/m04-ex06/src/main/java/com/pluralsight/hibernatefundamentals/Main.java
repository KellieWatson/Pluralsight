package com.pluralsight.hibernatefundamentals;

import com.pluralsight.hibernatefundamentals.airport.Passenger;
import com.pluralsight.hibernatefundamentals.airport.Ticket;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m04.ex06");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Passenger john = new Passenger("John Smith");

        Ticket ticket1 = new Ticket("AA1234");
        Ticket ticket2 = new Ticket("BB5678");

        john.addTicket(ticket1);
        john.addTicket(ticket2);

        em.getTransaction().commit();
        emf.close();
    }
}
