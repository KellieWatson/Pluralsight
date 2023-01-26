package com.pluralsight.persistencejakartaee;

import com.pluralsight.persistencejakartaee.airport.Passenger;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.m05.ex06");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Passenger john = new Passenger("John Smith");
        john.setVip(true);

        Passenger mike = new Passenger("Michael Johnson");
        mike.setVip(false);

        em.persist(john);
        em.persist(mike);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
