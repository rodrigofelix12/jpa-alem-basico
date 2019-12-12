package com.algaworks.crud.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.crud.modelo.Agenda;

public class ExcluindoAgenda {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 1L);
		em.getTransaction().begin();
		em.remove(agenda);
		em.getTransaction().commit();
		
		System.out.println("Agenda removida com sucesso!");
		
	}

}
