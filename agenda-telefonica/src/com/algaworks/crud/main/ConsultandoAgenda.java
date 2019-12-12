package com.algaworks.crud.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.crud.modelo.Agenda;

public class ConsultandoAgenda {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 1L);
		if (agenda != null) {
			System.out.println("Nome: " + agenda.getNome());
			System.out.println("Telefone: " + agenda.getTelefone());
			System.out.println("Data Registro: " + agenda.getDataRegistro());
		} else {
			System.out.println("Não há dados!");
		}
		
	}

}
