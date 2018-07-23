package arroz.models.cidade;

import java.util.List;


public interface CidadeService {

    public void create(Cidade cidade);
    
    public void delete(Long id);

    public Cidade findById(Long id);

    public List<Cidade> findAll();

    List<Cidade> findAllByFilters(String filtros);
    
}
