package arroz.models.generic;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface GenericDAO<T, ID extends Serializable> extends Repository<T, ID>{

    // public Query createQuery(StringBuilder sQuery);

    // public T findById(ID id);

    // public T save(T entity);

    // public void delete(Long id);

    // public T update(T entity);

    // public List<T> findAll();

    // public List<T> loadAllByFilters(UtilFiltroSearch filtros);

    // public boolean checkIfExist(UtilFiltroSearch filtros, Long id);

    // public String executQuery(String query);

    // public void flush();
    
}
