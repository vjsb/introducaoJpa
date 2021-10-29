package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//como o banco é auto_increment ele ira inserir os ids, aqui tem que ficar null
//		Pessoa p1 = new Pessoa(null, "joão", "joao@gmail.com");
//		Pessoa p2 = new Pessoa(null, "maria", "maria@gmail.com");
//		Pessoa p3 = new Pessoa(null, "carla", "Carla@hotmail.com");
		
		//esse exemplo-jpa é o nome dado no persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//PARA APAGAR ALGUEM DO BANCO
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto");
		em.close();
		emf.close();
		
		
		//PARA BUSCAR UM ID EM ESPECIFICO DENTRO DO BANCO
//		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);
//		System.out.println("Pronto!");
//		em.close();
//		emf.close();
		
		
//		COMANDO USADO PARA SALVAR ALGO NO BANCO
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//		System.out.println("Pronto!");
//		em.close();
//		emf.close();
	}

}
