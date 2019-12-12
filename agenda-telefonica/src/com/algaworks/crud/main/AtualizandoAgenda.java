package com.algaworks.crud.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.crud.modelo.Agenda;

public class AtualizandoAgenda {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Agenda agenda = em.find(Agenda.class, 1L);
		em.getTransaction().begin();
		agenda.setNome("Rodrigo Almeida Felix");
		agenda.setTelefone("30122504");
		em.getTransaction().commit();
		
		System.out.println("Agenda atualizada com sucesso");
		
		System.out.println("Nome: " + agenda.getNome());
		System.out.println("Telefone: " + agenda.getTelefone());
	}

}
