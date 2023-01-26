package com.pluralsight.persistencejakartaee;

import com.pluralsight.persistencejakartaee.airport.OneWayTicket;
import com.pluralsight.persistencejakartaee.airport.ReturnTicket;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.m05.ex05");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        OneWayTicket oneWayTicket = new OneWayTicket();
        oneWayTicket.setNumber("AA1234");
        oneWayTicket.setLatestDepartureDate(LocalDate.of(2024, 3, 20));

        ReturnTicket returnTicket = new ReturnTicket();
        returnTicket.setNumber("BB5678");
        returnTicket.setLatestReturnDate(LocalDate.of(2024, 1, 31));

        em.persist(oneWayTicket);
        em.persist(returnTicket);

        em.getTransaction().commit();
        emf.close();
    }
}
