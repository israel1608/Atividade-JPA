package dao.exemplo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidades.Emprestimo;

public class EmprestimoDAO implements DAO<Emprestimo> {
	EntityManager em = getEntityManager();

	@Override
	public Emprestimo findById(int id) {
		return em.find(Emprestimo.class, id);
	}

	@Override
	public List<Emprestimo> findAll() {
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(Emprestimo.class));
		return getEntityManager().createQuery(cq).getResultList();
	}

	@Override
	public void insert(Emprestimo t) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(t);
		transaction.commit();
	}

	@Override
	public void update(Emprestimo t) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.merge(t);
		transaction.commit();
	}

	@Override
	public void delete(Emprestimo t) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Emprestimo pessoa = em.find(Emprestimo.class, t.getId());
		em.remove(pessoa);
		transaction.commit();
	}

}
