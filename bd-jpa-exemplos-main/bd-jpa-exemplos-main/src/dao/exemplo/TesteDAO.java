package dao.exemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entidades.Emprestimo;
import util.pegarData;

public class TesteDAO {

	public static void main(String[] args) {
		DAO dao = new EmprestimoDAO();
		EntityManager em = dao.getEntityManager();

		realizarEmprestimo(em);
		// altera(em);
		em.close();
	}

	private static void realizarEmprestimo(EntityManager em) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Emprestimo p = new Emprestimo(4,2);
		em.persist(p);
		transaction.commit();
	}

}
