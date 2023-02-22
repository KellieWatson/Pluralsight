package com.pluralsight.persistencejakartaee;

import com.pluralsight.persistencejakartaee.airport.Ticket;
import com.pluralsight.persistencejakartaee.airport.TicketKey;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.m03.ex05");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        TicketKey key = new TicketKey();
        key.setSeries("AA");
        key.setNumber("1234");

        Ticket ticket1 = new Ticket();
        ticket1.setId(key);
        ticket1.setOrigin("Bucharest");
        ticket1.setDestination("London");
        em.persist(ticket1);

        em.getTransaction().commit();
        emf.close();
    }
}