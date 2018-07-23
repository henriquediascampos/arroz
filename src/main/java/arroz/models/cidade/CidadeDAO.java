package arroz.models.cidade;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import arroz.models.generic.GenericDAOImpl;

@Repository
@Transactional
public class CidadeDAO extends GenericDAOImpl<Cidade, Long> {

	@Override
	public Cidade save(Cidade entity) {
		return null;
	}

	@Override
	public void delete(Long id) {
		
	}

	@Override
	public Cidade update(Cidade entity) {
		return null;
	}

	@Override
	public List<Cidade> findAll() {
		return null;
	}

	@Override
	public String executQuery(String query) {
		return null;
	}

	@Override
	public void flush() {
		
	}

	@Override
	public Cidade findById(Long id) {
		return null;
	}

}
