package com.algaworks.crud.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.crud.modelo.Agenda;

public class SalvandoAgenda {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = new Agenda();
		agenda.setNome("Rodrigo");
		agenda.setTelefone("991738246");
		agenda.setDataRegistro(new Date());
		
		em.getTransaction().begin();
		em.persist(agenda);
		em.getTransaction().commit();
		
		System.out.println("Agenda cadastrada com sucesso");
	}

}
