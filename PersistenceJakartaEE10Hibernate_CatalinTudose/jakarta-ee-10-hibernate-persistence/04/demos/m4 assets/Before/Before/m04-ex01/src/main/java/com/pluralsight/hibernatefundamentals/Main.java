package com.pluralsight.hibernatefundamentals;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m04.ex01");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();


        em.getTransaction().commit();
        emf.close();
    }
}
