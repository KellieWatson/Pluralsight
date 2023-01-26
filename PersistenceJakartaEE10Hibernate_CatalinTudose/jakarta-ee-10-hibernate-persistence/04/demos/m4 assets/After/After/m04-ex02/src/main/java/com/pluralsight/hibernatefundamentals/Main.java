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
        Passenger mike = new Passenger("Mike Johnson");
        Ticket ticket1 = new Ticket("AA1234");
        john.addTicket(ticket1);
        mike.addTicket(ticket1);
        ticket1.addPassenger(john);
        ticket1.addPassenger(mike);

        Ticket ticket2 = new Ticket("BB5678");
        john.addTicket(ticket2);
        mike.addTicket(ticket2);
        ticket2.addPassenger(john);
        ticket2.addPassenger(mike);

        em.persist(john);
        em.persist(mike);
        em.persist(ticket1);
        em.persist(ticket2);

        em.getTransaction().commit();
        emf.close();
    }
}
