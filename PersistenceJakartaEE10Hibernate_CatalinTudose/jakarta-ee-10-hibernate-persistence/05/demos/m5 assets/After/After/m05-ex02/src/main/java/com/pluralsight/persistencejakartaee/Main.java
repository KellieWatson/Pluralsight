package com.pluralsight.persistencejakartaee;

import com.pluralsight.persistencejakartaee.airport.OneWayTicket;
import com.pluralsight.persistencejakartaee.airport.Passenger;
import com.pluralsight.persistencejakartaee.airport.ReturnTicket;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.m05.ex02");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Passenger john = new Passenger("John Smith");

        OneWayTicket oneWayTicket = new OneWayTicket();
        oneWayTicket.setNumber("AA1234");
        oneWayTicket.setLatestDepartureDate(LocalDate.of(2021, 3, 20));
        oneWayTicket.setPassenger(john);

        ReturnTicket returnTicket = new ReturnTicket();
        returnTicket.setNumber("BB5678");
        returnTicket.setLatestReturnDate(LocalDate.of(2022, 1, 31));
        returnTicket.setPassenger(john);

        em.persist(john);
        em.persist(oneWayTicket);
        em.persist(returnTicket);

        em.getTransaction().commit();
        emf.close();
    }
}
