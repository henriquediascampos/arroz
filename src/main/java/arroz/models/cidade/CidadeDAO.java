package arroz.models.cidade;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import arroz.models.generic.GenericDAOImpl;

@Repository
@Transactional
public class CidadeDAO extends GenericDAOImpl<Cidade, Long> {

	public void save(Cidade entity) {
		entityManager.persist(entity);		
	}

	public void delete(Long id) {
		// Criteria criteria = session.
	}

	public Cidade update(Cidade entity) {
		EntityManager ef = entityManagerFactory.createEntityManager();
		
		
		return null;
	}

	public String executQuery(String query) {
		return null;
	}

	public void flush() {
		
	}

	public Cidade findById(Long id) {
		return entityManager.find(Cidade.class, id);
	}

	public List<Cidade> findAll() {
		String sql = "from Cidade";
		return (List<Cidade>) entityManager.createQuery(sql).getResultList();
	}

}
