package com.pluralsight.hibernatefundamentals;

import com.pluralsight.hibernatefundamentals.airport.Passenger;
import com.pluralsight.hibernatefundamentals.airport.Ticket;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m04.ex01");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Passenger john = new Passenger("John Smith");
        Ticket ticket1 = new Ticket("AA1234");
        ticket1.setPassenger(john);
        john.addTicket(ticket1);

        Ticket ticket2 = new Ticket("BB5678");
        ticket2.setPassenger(john);
        john.addTicket(ticket2);

        em.persist(john);
        em.persist(ticket1);
        em.persist(ticket2);

        em.getTransaction().commit();
        emf.close();
    }
}
