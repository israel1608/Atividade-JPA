package dao.exemplo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entidades.Emprestimo;
import util.pegarData;

public class TesteDAO {

	public static void main(String[] args) {
		DAO dao = new EmprestimoDAO();
		EntityManager em = dao.getEntityManager(); // Entidade gerenciadora 
		
		Emprestimo p = new Emprestimo(2,5);  //parâmetros para emprestimo id aluno, codigo publicação
		
		dao.insert(p);  // Função insert() 
		
	  //dao.delete(p); descomente para testar a função DELETE !!!

		imprimirEmprestimos(dao); //Função FindAll() -----
		
		em.close();
	}
	
	public static void imprimirEmprestimos(DAO dao) {
	    List<Emprestimo> emprestimos = dao.findAll();

	    if (emprestimos.isEmpty()) {
	        System.out.println("Nenhum empréstimo encontrado.");
	    } else {
	        System.out.println("Lista de Empréstimos:");
	        for (Emprestimo emprestimo : emprestimos) {
	            System.out.println("ID: " + emprestimo.getId());
	            System.out.println("codigo aluno: " + emprestimo.getAlunoId()); 
	            System.out.println("codigo livro: " + emprestimo.getCodigoPub()); 
	            System.out.println("Data emprestimo: " + emprestimo.getData_emprestimo());
	            System.out.println();
	        }
	    }
	}


}
