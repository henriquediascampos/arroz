package arroz.models.cidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional // lembra do beginTransaction
public class CidadeServiceImpl implements CidadeService {


    public CidadeServiceImpl() {
    }

    @Override
    public Cidade findById(Long id) {
        // return cidadeDAO.findById(id);
        return null;
    }

    @Override
    public void create(Cidade cidade) {

    }

    @Override
    public List<Cidade> findAllByFilters(String filtros) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Cidade> findAll() {
        return null;
    }
}
