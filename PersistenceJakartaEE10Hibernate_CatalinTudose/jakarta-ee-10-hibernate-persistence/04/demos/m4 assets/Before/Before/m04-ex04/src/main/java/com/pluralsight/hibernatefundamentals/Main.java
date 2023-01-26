package com.pluralsight.hibernatefundamentals;

import com.pluralsight.hibernatefundamentals.airport.Payment;
import com.pluralsight.hibernatefundamentals.airport.Ticket;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m04.ex04");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Ticket ticket = new Ticket();
        ticket.setNumber("AA1234");
        ticket.setOrigin("London");
        ticket.setDestination("Bucharest");

        Payment payment = new Payment();
        payment.setTicket(ticket);
        payment.setAmount(200);

        em.getTransaction().commit();
        emf.close();
    }
}
